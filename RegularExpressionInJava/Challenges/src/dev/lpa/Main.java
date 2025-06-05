package dev.lpa;

public class Main {

    public static void main(String[] args) {

        String helloWorld = "%s %s".formatted("Hello,","World!");
        System.out.println(helloWorld);

        boolean isMatch = helloWorld.matches("Hello, World!");
        System.out.println(isMatch);



    }
}
