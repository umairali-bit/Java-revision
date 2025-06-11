package dev.lpa;

import java.util.regex.Matcher;
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

        System.out.println("Matched on : " + matcher.group());

        String htmlSnippet = """
                <H1>My Heading </H1>
                <h2>Sub-heading</h2>
                <p>This is a paragraph about something.</p>
                <p>This is another paragraph about something else.</p>
                <h3>Summary</h3>
                
                """;
        Pattern htmlPattern = Pattern.compile("<[hH](?<level>\\d)>(.*)</[hH]\\d>");
        Matcher htmlMatcher = htmlPattern.matcher(htmlSnippet);

        while (htmlMatcher.find()) {
//            System.out.println("group: " + htmlMatcher.group());
//            System.out.println("group0: " + htmlMatcher.group(0));
            System.out.println(htmlMatcher.group("level") + " " +
                    htmlMatcher.group(2));
            System.out.println("index = " + htmlMatcher.start("level"));
        }

        htmlMatcher.reset();
        htmlMatcher.results().forEach(mr -> System.out.println(mr.group(1) + " " + mr.group(2)));


        String tabbedText = """
                
                group1 group2 group3
                1   2   3
                a   b   d
                """;

        tabbedText.lines()
                .flatMap(s -> Pattern.compile("\\t").splitAsStream(s))
                .forEach(System.out::println);

        htmlMatcher.reset();
        String updatesSnippet = htmlMatcher.replaceFirst((mr) ->
                "<em>" + htmlMatcher.group(2) + "</em");
        System.out.println("-".repeat(50));
        System.out.println(updatesSnippet);
        System.out.println(htmlMatcher.start() + " : " + htmlMatcher.end());
        System.out.println(htmlMatcher.group(2));


        htmlMatcher.reset();
        System.out.println("-".repeat(30));

    }
}
