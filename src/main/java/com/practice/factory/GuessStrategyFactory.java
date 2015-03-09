package com.practice.factory;

import com.practice.enums.StrategyFactory;
import com.practice.strategy.BinarySearchGuessStrategy;
import com.practice.strategy.GuessStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Author vmeda
 */

public class GuessStrategyFactory {
    private static Map<String,GuessStrategy> strategies =
            new HashMap<String,GuessStrategy>();

    static {
        strategies.put (StrategyFactory.BINARYSEARCH.getStrategyFactory(), new BinarySearchGuessStrategy());
    }

    public static GuessStrategy getInstance(String key ) {
        if ( strategies.containsKey(key)) {
            return strategies.get(key);
        }
        return getInstance();
    }
    public static GuessStrategy getInstance(){
        return strategies.get(StrategyFactory.BINARYSEARCH.getStrategyFactory());
    }
}
