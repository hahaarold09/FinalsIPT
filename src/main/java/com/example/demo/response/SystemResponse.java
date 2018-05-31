package com.example.demo.response;

/**
 * Created by Harold on 5/20/2018.
 */
public class SystemResponse {
    private boolean flag;
    private String message;
    private String recommendation;
    private String price;


    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public SystemResponse(boolean flag, String message, String recommendation) {

        this.flag = flag;
        this.message = message;
        this.recommendation = recommendation;
    }

    public SystemResponse(){

    }

    public SystemResponse(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isFlag() {
        return flag;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
