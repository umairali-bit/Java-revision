package dev.lpa;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String sentence = "I like motorcycles.";
        boolean matched = Pattern.matches("[A-Z].*[.]", sentence);
        System.out.println(matched);


    }
}
