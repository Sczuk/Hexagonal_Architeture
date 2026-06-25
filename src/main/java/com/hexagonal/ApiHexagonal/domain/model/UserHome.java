package com.hexagonal.ApiHexagonal.domain.model;

import com.hexagonal.ApiHexagonal.domain.model.enums.UserHomeCondition;

public class UserHome {

    private int id;

    private User user;

    private Home home;

    private UserHomeCondition condition;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public UserHomeCondition getCondition() {
        return condition;
    }

    public void setCondition(UserHomeCondition condition) {
        this.condition = condition;
    }
}
