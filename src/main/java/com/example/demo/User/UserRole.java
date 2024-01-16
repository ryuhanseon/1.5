package com.example.demo.User;

import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN("ROLE_ADMIN"),
        ROLE("ROLE_USER");

    UserRole(String value){
        this.value=value;
    }


    private String value;


}
