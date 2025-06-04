package dev.lpa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String helloWorld = "%s %s".formatted("Hello", "World");
        String helloWorld2 = String.format("%s %s", "Hello", "World");
        System.out.println("Using string's formatted method: " + helloWorld);
        System.out.println("Using String.format: " + helloWorld2);

        String helloWorld3 = Main.format("%s %s", "Hello", "World");
        System.out.println(helloWorld3);

//  test string
    String testString = "Anyone can Learn abc's, 123's, and any regular expression";
    String replacement = "(-)";

    String[] patterns = {
            "[a-zA-z]*$",
            "^[a-zA-Z]{3}",
            "[aA]ny\\b"
    };

    for (String pattern : patterns) {
        String output = testString.replaceFirst(pattern,replacement);
        System.out.println("Pattern: " + pattern + " => " + output);

    }

    String paragraph = """
            Double, double toil and trouble;
            Fire burn and caldron buubble.
            Fillet of a fenny snake,
            In the caldron boil and bake
            Eye of newt and toe of frog,
            Wool of bat and tongue of dog,
            Adder's fork and blind-worm's sting,
            Lizard's leg and howlet's wing,
            For a charm of powerful trouble,
            Like a hell-broth boil and bubble
            """;
//  Counting lines
        String[] lines = paragraph.split("\\R");//identify line breaker
        System.out.println("This paragraph has " + lines.length + " lines");
//  Counting words
        String[] words = paragraph.split("\\s");//identify white spaces
        System.out.println("This paragraph has " + words.length + " words");
//  Replacing words
        System.out.println(paragraph.replaceAll("[a-zA-Z]+ble","[GRUB]"));

//  methods on scanner class
//        Scanner scanner = new Scanner(System.in);//System.in is the standard input stream in Java - usually the keyboard
        Scanner scanner = new Scanner(paragraph);
        System.out.println(scanner.delimiter());

        while (scanner.hasNext()) {
            String element = scanner.next();
            System.out.println(element);
        }
        scanner.close();;








    }

    private static String format(String regexp, String... args) {

        int index = 0;
//        while(regexp.contains("%s")) {
//            regexp = regexp.replaceFirst("%s", args[index++]);
//        }

        while(regexp.matches(".*%s.*")) {
            regexp = regexp.replaceFirst("%s", args[index++]);
        }

        return regexp;
    }
}
