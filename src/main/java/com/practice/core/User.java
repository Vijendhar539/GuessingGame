package com.practice.core;

import com.practice.enums.UserResponseState;
import java.util.Random;

/**
 * Author vmeda
 *
 * User is primary object for playing the Guessing Game and responsible for following actions.
 *  a) User should pick a number and type ready.
 *  b)  provide method for computer to validate against the Guess.
 *    This method typically responding with Enum, which consists of following states
 *    i) END - if the user is not ready,then  respond with END
 *    ii) HIGHER - if the computer input is smaller than user chosen number,then respond with HIGHER
 *    iii) LOWER - if the computer input is higher than user chosen number,then respond with LOWER.
 *    iV) YES - if the computer input matches with the user chosen number, then respond with YES.
 */


public class User {

    private int chosenNumber = 0;
    private boolean ready = false;
    private Random rand = new Random();


    public void pickNumber() {
        chosenNumber = rand.nextInt(Integer.MAX_VALUE - 1);
        System.out.println("User: ready");
        System.out.println("User chooses number " + getChosenNumber() + " in his mind");
        ready = true;
    }

    public UserResponseState validateChosenNumber(int guessNumber) {

      if (!ready) { // The user is not ready, so end the game.
          return UserResponseState.END;
      }

      if (chosenNumber == guessNumber) {
          return UserResponseState.YES;
      } else {
          if (chosenNumber > guessNumber) {
              return UserResponseState.HIGHER;
          }
          return UserResponseState.LOWER;
      }
    }


    public int getChosenNumber() {
        return chosenNumber;
    }
}
