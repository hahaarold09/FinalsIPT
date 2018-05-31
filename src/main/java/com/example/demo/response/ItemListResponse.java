package com.example.demo.response;

import com.example.demo.entity.Item;

import java.util.List;

/**
 * Created by Harold on 5/30/2018.
 */
public class ItemListResponse {

    private SystemResponse systemResponse;
    private List<Item> item;

    public ItemListResponse(SystemResponse systemResponse, List<Item> item) {
        this.systemResponse = systemResponse;
        this.item = item;
    }

    public ItemListResponse() {

    }

    public SystemResponse getSystemResponse() {
        return systemResponse;
    }

    public void setSystemResponse(SystemResponse systemResponse) {
        this.systemResponse = systemResponse;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }
}
