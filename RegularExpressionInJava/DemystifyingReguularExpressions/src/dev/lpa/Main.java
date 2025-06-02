package dev.lpa;

public class Main {

    public static void main(String[] args) {

        String helloWorld = "%s %s".formatted("Hello", "World");
        String helloWorld2 = String.format("%s %s", "Hello", "World");
        System.out.println("Using string's formatted method: " + helloWorld);
        System.out.println("Using String.format: " + helloWorld2);
    }
}
