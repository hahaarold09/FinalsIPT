package com.example.demo.response;

import com.example.demo.entity.User;

import java.util.List;

/**
 * Created by Harold on 5/20/2018.
 */
public class UserListResponse {

    private SystemResponse systemResponse;
    private List<User> user;

    public UserListResponse() {
    }

    public UserListResponse(SystemResponse systemResponse, List<User> customers) {
        this.systemResponse = systemResponse;
        this.user = customers;
    }

    public SystemResponse getSystemResponse() {
        return systemResponse;
    }

    public void setSystemResponse(SystemResponse systemResponse) {
        this.systemResponse = systemResponse;
    }

    public List<User> getCustomers() {
        return user;
    }

    public void setCustomers(List<User> customers) {
        this.user = customers;
    }
}
