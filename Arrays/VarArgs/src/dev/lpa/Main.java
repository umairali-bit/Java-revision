package dev.lpa;

public class Main {

    public static void main(String... args) { //notice the change in argument

        System.out.println("Hello world again");
        String[] splitString = "Hello World again".split(" ");
        printText(splitString);

        System.out.println("-".repeat(20));
        printText("Hello");


        System.out.println("-".repeat(20));
        printText("Hello","World","Again");

        System.out.println("-".repeat(20));
        printText();


        String[] sArray = {"first", "second","third","fourth","fifth"};
        System.out.println(String.join(",", sArray));
    }

    private static void printText(String... textList){

        //use of enhanced loop to circle through the textList array


        for(String t : textList){
            System.out.println(t);
        }

    }
}
