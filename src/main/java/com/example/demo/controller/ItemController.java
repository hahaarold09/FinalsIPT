package com.example.demo.controller;

import com.example.demo.entity.Item;
import com.example.demo.response.ItemListResponse;
import com.example.demo.response.SystemResponse;
import com.example.demo.service.ItemService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Harold on 5/30/2018.
 */

@RestController
public class ItemController {

    private ItemService mItemService;

    public ItemController(ItemService mItemService) {
        this.mItemService = mItemService;
    }

    //addItems
    @RequestMapping(value="/addItem",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SystemResponse addItem(
            @RequestBody Item item
    ){
        mItemService.saveItems(item);
        return new SystemResponse(true,item.getItemName()+" is added succesfully.");
    }


    //itemList
    @RequestMapping(value = "/itemList",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ItemListResponse itemList(){

        ItemListResponse clr = new ItemListResponse();
        clr.setItem(mItemService.getItems());
        SystemResponse systemResponse = new SystemResponse(true,"Fetching all the Items Available");
        clr.setSystemResponse(systemResponse);

        return clr;
    }
}
