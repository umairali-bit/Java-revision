package dev.lpa;

public class Main {

    public static void main(String[] args) {

        String helloWorld = "%s %s".formatted("Hello,","World!");
        System.out.println(helloWorld);

        boolean isMatch = helloWorld.matches("Hello, World!");
        System.out.println(isMatch);

        String[] sentences = {
                "The bike is red.",
                "I am a new student.",
                "hello world.",
                "How are you?"
        };

        String regex = "^[A-Z][a-z]*(\\s[a-z]+)*\\.$";

        for (String s : sentences) {
            boolean matches = s.matches(regex);
            System.out.println("\"" + s + "\" matches: " + matches);

        }

        String[] sentences2 = {
                "The bike is red, and has flat tires.",
                "I love being a new L.P.A student!",
                "Hello, friends and family: Welcome!",

        };

        String regex2 = "^[A-Z][\\w\\s,:.']*[.!?]$";

        for (String s2 : sentences2) {
            boolean matches2 = s2.matches(regex2);
            System.out.println("\"" + s2 + "\" matches: " + matches2);
        }





    }
}
