package dev.lpa;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //pattern class
        String sentence = "I like B.M.W motorcycles.";
        boolean matched = Pattern.matches("[A-Z].*[.]", sentence);
        System.out.println(matched + ": " + sentence);

        //matcher class
        Pattern firstPattern = Pattern.compile("[A-Z].*?[.]");
        var matcher = firstPattern.matcher(sentence);
        System.out.println(matcher.matches() + ": " + sentence);
        System.out.println("sentence.length: " + sentence.length());
        System.out.println("Matched Ending Index: " + matcher.end());

        System.out.println(matcher.lookingAt() + ": " + sentence);
        System.out.println("Matched Ending Index: " + matcher.end());
        System.out.println("Matched on : " + sentence.substring(0, matcher.end()));

        matcher.reset();
        System.out.println(matcher.find() + ": " + sentence);
        System.out.println("Matched Ending Index: " + matcher.end());
        System.out.println("Matched on : " + sentence.substring(matcher.start(), matcher.end()));



    }
}
