package com.practicetest;

import com.practice.exception.OutofRangeStrategyException;
import com.practice.exception.StrategyException;
import com.practice.strategy.BinarySearchGuessStrategy;
import com.practice.strategy.GuessStrategy;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestBinarySearchGuessStrategy extends TestCase {

    GuessStrategy guessStrategy;

    @Override
    public void setUp() {
        guessStrategy = new BinarySearchGuessStrategy();
    }

    @Test
    public void testInitialGuessNumber() throws StrategyException{
        assertEquals( guessStrategy.getInitialGuessNumber() , Integer.MAX_VALUE/2);
    }

    @Test
    public void testOutofRangeException() throws StrategyException{
        try {
            guessStrategy.getNextHighGuessNumber(Integer.MAX_VALUE - 1);
        }
        catch(OutofRangeStrategyException ex) {
         assertTrue(ex.getMessage().contains("Searchable Range is only between"));
        }
    }
    @Test
    public void testValueWithInRange() throws StrategyException {
        int value = guessStrategy.getNextLowGuessNumber(500);
        assertTrue (value >= 0);
    }
}
