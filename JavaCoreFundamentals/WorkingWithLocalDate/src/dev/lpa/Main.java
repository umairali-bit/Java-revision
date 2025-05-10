package dev.lpa;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

//        getting todays date
        LocalDate today = LocalDate.now();
        System.out.println(today);

//        Dates in other formats
//        2025-05-05
        LocalDate five5 = LocalDate.of(2025, 5,5);
        System.out.println(five5);



    }
}
