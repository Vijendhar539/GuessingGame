package com.practice.main;

import com.practice.core.PlayGuessingGame;
import com.practice.core.User;
import com.practice.factory.GuessStrategyFactory;
import com.practice.strategy.BinarySearchGuessStrategy;
import com.practice.strategy.GuessStrategy;
import com.practice.exception.GuessingGameException;

/**
 * Author vmeda
 *
 * Main class to play Guessing Game.
 */

public class NumberGuessingMain {

    public static void main(String[] args) {

     try {
            GuessStrategy strategy = GuessStrategyFactory.getInstance();
            User user = new User();
            user.pickNumber();

            PlayGuessingGame game = new PlayGuessingGame(user, strategy);
            game.runGame();
        }catch(GuessingGameException ex) {
            ex.printStackTrace();
        }
    }
}
