package com.practice.enums;

/**
 * Author vmeda
 *
 * This represent the User Response State during the playing of the game to respond
 */

public enum UserResponseState {
    HIGHER("higher"),
    LOWER("lower"),
    YES("yes"),
    END("end");

    private String value;
    UserResponseState(String value) {
        this.value = value;
    }
    public String getUserResponnseState() {
        return value;
    }
}
