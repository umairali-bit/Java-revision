package dev.lpa;

public class Main {

    public static void main(String[] args) {

        String helloWorld = "%s %s".formatted("Hello", "World");
        String helloWorld2 = String.format("%s %s", "Hello", "World");
        System.out.println("Using string's formatted method: " + helloWorld);
        System.out.println("Using String.format: " + helloWorld2);

        String helloWorld3 = Main.format("%s %s", "Hello", "World");
        System.out.println(helloWorld3);
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
