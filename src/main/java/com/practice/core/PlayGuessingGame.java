package com.practice.core;

import com.practice.enums.UserResponseState;
import com.practice.exception.StrategyException;
import com.practice.strategy.GuessStrategy;
import com.practice.exception.GuessingGameException;

/**
 * Author vmeda
 *
 * This class is responsible for
 * a) running the game based on the strategy and validates against the user chosen number
 * b) read back the response ( higher, lower etc .. ) after each validation,
 * then respond with the guessing strategy accordingly.
 * c) if the response comes as END or YES, then stop the execution.
 *
 */

public class PlayGuessingGame {
        private User user;
        private GuessStrategy strategy;
        private int numPasses = 0;

        public PlayGuessingGame(User user, GuessStrategy strategy) {
            this.user = user;
            this.strategy = strategy;
        }

        public void runGame() throws GuessingGameException {

        boolean guessNotMatched = true;
        try {
            int guessNumber = strategy.getInitialGuessNumber();

            while (guessNotMatched) {

                UserResponseState state = user.validateChosenNumber(guessNumber);

                System.out.println("Computer: Is the Number " + guessNumber + " ?");
                System.out.println("User: " + state.getUserResponnseState());

                switch (state) {
                    case YES:
                    case END:
                        guessNotMatched = false;
                        break;
                    case HIGHER:
                        guessNumber = strategy.getNextHighGuessNumber(guessNumber);
                        break;
                    case LOWER:
                        guessNumber = strategy.getNextLowGuessNumber(guessNumber);
                        break;
                }

                numPasses++;
            }
        }catch(StrategyException se) {
            numPasses = 0;
            // Log the exception.
        }

    }


    public int getNumPasses() {
        return numPasses;
    }


}
