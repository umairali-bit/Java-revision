package dev.lpa.Fundamentals;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day abbreviation (e.g., M, Tu, W, Th): ");

//        char word = sc.next().charAt(0);
//
//        word = Character.toLowerCase(word);

        String input = sc.next().toLowerCase();

        switch (input) {
            case "m":
                System.out.println("The day of the week is Monday");
                break;
            case "tu":
                System.out.println("The day of the week is Tuesday");
                break;
            case "w":
                System.out.println("The day of the week is Wednesday");
                break;
            case "th":
                System.out.println("The day of the week is Thursday");
                break;
            case "f":
                System.out.println("The day of the week is Friday");
                break;
            case "sa":
                System.out.println("The day of the week is Saturday");
                break;
            case "su":
                System.out.println("The day of the week is Sunday");
                break;
            default:
                System.out.println("Unknown Abbreviation");




        }
    }
}
