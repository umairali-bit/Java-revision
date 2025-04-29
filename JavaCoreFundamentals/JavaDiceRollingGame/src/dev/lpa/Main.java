package dev.lpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

//  two static variables
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//   for dice using a list
        List<Integer> currentDice = new ArrayList<>();

//        int rolls = 0;
        do {
            rollDice(currentDice);
//            currentDice.clear();
        } while (!pickLosers(currentDice));
        System.out.println("Game over. Real game would score and continue.");






    }


//    for rolling and re-rolling dice
    private static void rollDice(List<Integer> currentDice) {

        int randomCount = 5 - currentDice.size();// you need to roll 5 dice

        var newDice = random
                .ints(randomCount, 1, 7)
                .boxed()
                .toList();

        currentDice.addAll(newDice);

        System.out.println("Random dice number: " + currentDice);

    }


    private static boolean pickLosers(List <Integer> currentDice) {

        String prompt = """
                Press Enter to Score
                Type "ALL" to re-roll all the dice
                List numbers (separated by spaces) to re-roll selected dice.
                """;

        System.out.println(prompt + "-----> ");
        String userInput = scanner.nextLine();
        if(userInput.isBlank()) {
            return true;
        }
        try {
            removeDice(currentDice,userInput.split(" "));

        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("Bad input, Try again");
        }

        return false;

    }

    private static void removeDice(List<Integer> currentDice, String[] selected) {

        if (selected.length == 1 && selected [0].contains("ALL")) {
            currentDice.clear();
        } else {
            for (String removed: selected) {
                currentDice.remove(Integer.valueOf(removed));
            }

            System.out.println("Keeping the Dice " + currentDice);
        }
    }
}
