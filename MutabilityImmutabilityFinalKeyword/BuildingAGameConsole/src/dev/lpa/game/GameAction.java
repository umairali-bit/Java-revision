package dev.lpa.game;

import java.util.function.Predicate;

/*
You'll also want to create a GameAction record with three fields.
There should be a key, a char field, which is the key a user would press to select the action.
Next, include a prompt, which is displayed to the user to describe the specific action.
There should be an action field, for a lambda expression or method reference. I'll be using a Predicate with an Integer
type argument. The integer is the player's index in the player list. A predicate always returns a boolean result.
This will be used to continue or end the play.

 */

public record GameAction(char key, String prompt, Predicate<Integer> action) {


}
