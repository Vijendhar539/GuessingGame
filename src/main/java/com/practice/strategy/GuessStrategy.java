package com.practice.strategy;


import com.practice.exception.StrategyException;

/**
 * Author vmeda
 *
 * The guessing strategy supports the  following methods to support
 *
 * a) GuessInitalGuessNumber , This method allows the computer to start with guess.
 * b) GetNextHighGuessNumber, This method allows the computer to Guess a bigger number than previously
 * guessed number.
 * c) getNextLowGuessNumber, This method allows the computer to Guess a small number than previously
 * guessed number.
 */

public interface GuessStrategy {
    int getInitialGuessNumber() throws StrategyException;
    int getNextHighGuessNumber(int lowbound) throws StrategyException;
    int getNextLowGuessNumber(int upperbound) throws StrategyException;
}
