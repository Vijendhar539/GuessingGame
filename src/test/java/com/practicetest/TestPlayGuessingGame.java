package com.practicetest;

import junit.framework.TestCase;
import org.junit.*;
import com.practice.core.PlayGuessingGame;
import com.practice.core.User;
import com.practice.exception.GuessingGameException;
import com.practice.strategy.BinarySearchGuessStrategy;
import com.practice.strategy.GuessStrategy;

public class TestPlayGuessingGame extends TestCase {

    @Test(expected = GuessingGameException.class)
    public void testGuessingGame() throws GuessingGameException{
        GuessStrategy strategy = new BinarySearchGuessStrategy();
        User user = new User();
        user.pickNumber();

        PlayGuessingGame game = new PlayGuessingGame(user, strategy);

        game.runGame();

        assert(game.getNumPasses() > 0);
    }
}
