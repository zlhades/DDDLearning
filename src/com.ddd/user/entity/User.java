package com.ddd.user.entity;

import com.ddd.common.AbstractEntity;

public class User extends AbstractEntity {
    private String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
