package com.practice.exception;
/**
 * Author vmeda
 *
 * This exception is thrown when the issue arises with strategy.
 */

public class StrategyException extends GuessingGameException {

    public StrategyException(String msg) {
        super(msg);
    }

}
