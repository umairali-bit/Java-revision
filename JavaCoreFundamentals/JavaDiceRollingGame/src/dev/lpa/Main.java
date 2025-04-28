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

        int rolls = 0;
        do {
            rollDice(currentDice);
            currentDice.clear();
        } while (++rolls < 5);



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
}
