package dev.lpa;

import java.util.function.Function;

public class Main {


    public static void main(String[] args) {

        String name = "Tim";
        //Function<String,String> u1Case = s -> s.toUpperCase();
        Function<String, String> uCase = String :: toUpperCase;

        System.out.println(uCase.apply(name));

        //anThen()
        //Function<String, String> lastName1 = name::concat;
        Function<String, String> lastName = s-> s.concat(" Buchalka");
        Function<String, String> uCaseLastName = uCase.andThen(lastName);
        System.out.println(uCaseLastName.apply(name));

        //compose() works only with function or a Unary operator
        // it will execute last name concatenation first and then uppercase uCase execution
        uCaseLastName = uCase.compose(lastName);
        System.out.println(uCaseLastName.apply(name));
    }


}
