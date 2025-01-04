package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Main {


    public static void main(String[] args) {


        List<String> list = new ArrayList<>(List.of(
                "alpha", "bravo", "charlie", "delta"
        ));

        list.forEach(s -> System.out.println(s));

        list.removeIf(s -> s.equalsIgnoreCase("bravo"));

        System.out.println("------");
        list.forEach(s -> System.out.println(s));

        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());

        System.out.println("------");
        list.forEach(s -> System.out.println(s));

        //creating an array of 10 elements
        String[] emptyStrings = new String[10];
        System.out.println("------");
        System.out.println(Arrays.toString(emptyStrings));

        Arrays.fill(emptyStrings, " ");
        System.out.println(Arrays.toString(emptyStrings));

        Arrays.setAll(emptyStrings, (i) -> " " + (i + 1) + ".");
        System.out.println(Arrays.toString(emptyStrings));


        Arrays.setAll(emptyStrings, (i) -> " " + (i + 1) + "."
                + switch (i) {
            case 0 -> "one";
            case 1 -> "two";
            case 2 -> "three";
            default -> "";

                }
        );
        System.out.println(Arrays.toString(emptyStrings));

        System.out.println("------");

        String[] names = {"Ann", "Bob", "Carol", "David", "Ed", "Fred"};
        String[] randomList = randomlySelectedValues(15, names,
                () -> new Random().nextInt(0,names.length)); //supplier lambda expression
        System.out.println(Arrays.toString(randomList));


    }

    public static String[] randomlySelectedValues(int count,
                                                  String[] values,
                                                  Supplier<Integer> s) {

        String[] selectedValues = new String[count];
        for (int i = 0; i < count; i++) {
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;

    }
}
