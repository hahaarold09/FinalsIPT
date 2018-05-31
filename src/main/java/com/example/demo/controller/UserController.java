package com.example.demo.controller;

import com.example.demo.entity.Item;
import com.example.demo.model.CalcuPrice;
import com.example.demo.model.Recommendation;
import com.example.demo.entity.User;
import com.example.demo.response.SystemResponse;
import com.example.demo.service.ItemService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

/**
 * Created by Harold on 5/30/2018.
 */


@RestController
public class UserController {

    @Autowired
    private UserService mUserService;
    private ItemService mItemService;

    public UserController(ItemService mItemService) {
        this.mItemService = mItemService;
    }


    //register USER
    @RequestMapping(value="/addUser",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SystemResponse addUser(
            @RequestBody User user
    ){
        mUserService.saveUser(user);
        return new SystemResponse(true,user.getUsername()+" is added succesfully.");
    }

    // loginUSer


    @RequestMapping(value = "/login",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SystemResponse loginUser(@RequestBody User user){

        SystemResponse systemResponse = new SystemResponse();
        systemResponse.setFlag(mUserService.login(user));
        if(systemResponse.isFlag()){
            systemResponse.setMessage(user.getUsername()+" is logged in successfully.");
        }else{
            systemResponse.setMessage("wrong username or password");
        }
        return systemResponse;
    }

    @RequestMapping(value = "/buyItem",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SystemResponse buyItem(@RequestBody Item item, Recommendation recommendation, CalcuPrice calcPrice){
        SystemResponse systemResponse = new SystemResponse();
        systemResponse.setFlag(mUserService.buyItem(item));
        Random rand = new Random();

        if(systemResponse.isFlag()){
            systemResponse.setMessage(item.getItemName()+" is purchase");
            systemResponse.setPrice("Price : $"+calcPrice.doCalcu(item.getItemPrice(),item.getQuantity()));
            systemResponse.setRecommendation("Recommend Professor is "+ recommendation.getRecommendatoin()
                    .get(rand.nextInt(recommendation.getRecommendatoin().size())));
        }else{
            systemResponse.setMessage("Item Not Available");
        }
        return systemResponse;
    }



}
