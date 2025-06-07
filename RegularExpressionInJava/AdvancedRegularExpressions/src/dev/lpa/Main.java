package dev.lpa;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //pattern class
        String sentence = "I like motorcycles.";
        boolean matched = Pattern.matches("[A-Z].*[.]", sentence);
        System.out.println(matched + ": " + sentence);

        //matcher class
        Pattern firstPattern = Pattern.compile("[A-Z].*[.]");
        var matcher = firstPattern.matcher(sentence);
        System.out.println(matcher.matches() + ": " + sentence);


    }
}
