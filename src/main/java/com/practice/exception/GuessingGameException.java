package com.practice.exception;

/**
 * Author vmeda
 *
 * This class represents the super class of all the Exceptions during the playing of guessing game.
 *
 */

public class GuessingGameException extends Exception{

    public GuessingGameException(String msg) {
        super(msg);
    }
}
