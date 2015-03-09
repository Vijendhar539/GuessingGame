package com.practice.strategy;

import com.practice.exception.OutofRangeStrategyException;
import com.practice.exception.StrategyException;

/**
 * Author vmeda
 *
 * BinarySearch Guess strategy is the core of strategy.
 *
 * The implementation details are,
 *
 * This algorithm assumes user will give a positive number ( 0 to INT_MAX)
 *  a) Computer Initial guess as number INT_MAX / 2 ( low = 0, high = INT_MAX, avg = INT_MAX /2 )
 *  b) Depending on the user response higher or lower,
 *     i ) if user responds higher, The algorithm changes low from previously guessed value
 *     ii) if user responds lower, the alogrithm chagnges the high value to previously guess value.
 * c) repeat the process, until the user respond with YES
 * d) if the user chosen is not found by algorithm, Then it will throw the OutOfRangeException.
 */

public class BinarySearchGuessStrategy implements GuessStrategy {

    private int low = 0;
    private int high = Integer.MAX_VALUE;

    private final String msg = "The Searchable Range is only between " + low + " and " + high;

    public BinarySearchGuessStrategy() {

    }

    @Override
    public int getInitialGuessNumber() throws StrategyException {
            return calculateAverage();
    }

    @Override
    public int getNextHighGuessNumber(int lowbound) throws StrategyException{
        low = lowbound;
        if ( low > high || (high == Integer.MAX_VALUE && low == (Integer.MAX_VALUE -1)) ) {
            throw new OutofRangeStrategyException(msg);
        }
        return calculateAverage();
    }

    @Override
    public int getNextLowGuessNumber(int upperbound) throws  StrategyException{
        high = upperbound;
        if ( low > high || (high == 0 && low == 0)) {
            throw new OutofRangeStrategyException(msg);
        }
        return calculateAverage();
    }

    private int calculateAverage() {
        return low + (high - low)/2;
    }

}
