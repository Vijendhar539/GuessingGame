package com.practice.enums;

/**
 * Author vmeda
 *
 * Factory class is for supporting creation of strategies.
 */
public enum StrategyFactory {
    BINARYSEARCH("binarySearch");
    private String msg;

     StrategyFactory(String msg) {
        this.msg = msg;
    }
    public String getStrategyFactory(){
        return msg;
    }
}
