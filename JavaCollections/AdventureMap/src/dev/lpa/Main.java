package dev.lpa;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AdventureGame game = new AdventureGame();
        game.play("road");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String direction = scanner.nextLine().trim().toUpperCase(Locale.ROOT).substring(0,1);
            if (direction.equals("Q")) break;
            game.move(direction);

        }

    }
}
