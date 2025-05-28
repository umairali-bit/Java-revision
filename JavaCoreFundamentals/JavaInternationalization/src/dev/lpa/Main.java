package dev.lpa;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {

//// creating a ResourceBundle variable
//        ResourceBundle rb = ResourceBundle.getBundle("BasicText");
//        System.out.println(rb.getClass().getName());
//        System.out.println(rb.getBaseBundleName());
//        System.out.println(rb.keySet());


//        System.out.printf("%s %s!%n", rb.getString("hello"), rb.getString("world"));

        for (Locale l : List.of(Locale.US, Locale.CANADA_FRENCH, Locale.CANADA)) {
            ResourceBundle rb = ResourceBundle.getBundle("BasicText", l);
            System.out.println(rb.getClass().getName());
            System.out.println(rb.getBaseBundleName());
            System.out.println(rb.keySet());

            String message = "%s %s!%n".formatted(rb.getString("hello"), rb.getString("world"));

            ResourceBundle uui = ResourceBundle.getBundle("UIComponents", l);



        }


    }
}
