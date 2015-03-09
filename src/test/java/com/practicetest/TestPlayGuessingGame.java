package com.practicetest;

import org.junit.*;
import com.practice.core.PlayGuessingGame;
import com.practice.core.User;
import com.practice.exception.GuessingGameException;
import com.practice.strategy.BinarySearchGuessStrategy;
import com.practice.strategy.GuessStrategy;

public class TestPlayGuessingGame {

    @Test
    public void testGuessingGame() {
        GuessStrategy strategy = new BinarySearchGuessStrategy();
        User user = new User();
        user.pickNumber();

        PlayGuessingGame game = new PlayGuessingGame(user, strategy);
        try {
            game.runGame();
        }catch(Exception ex) {

        }
        assert(game.getNumPasses() > 0);
    }
}
