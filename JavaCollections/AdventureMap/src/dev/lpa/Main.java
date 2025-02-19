package dev.lpa;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        String myLocations = """
                lake,at the edge of Lake Tim,E:ocean,W:forest,S:well house,N:cave
                ocean, on Tim's beach before an angry sea,W:lake
                cave,at the mouth of Tim's bat cave,E:ocean,W:forest,S:lake
                """;

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
