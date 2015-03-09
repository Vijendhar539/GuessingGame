package com.practice.exception;

/**
 * Author vmeda
 *
 * This exception is thrown when the user chosen number is out of range than the strategy supports.
 * This is a specialized case of StrategyException.
 *
 */

public class OutofRangeStrategyException extends StrategyException{

    private String msg;
    public OutofRangeStrategyException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
