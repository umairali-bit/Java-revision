package dev.lpa;

import java.time.ZoneId;

public class Main {

    public static void main(String[] args) {

//  Zone ID class gives the time zone you are in
        System.out.println(ZoneId.systemDefault());//America/New_York

//  How many time zones are available
        System.out.println("Number of TZs = " + ZoneId.getAvailableZoneIds().size());//Number of TZs = 602

//  printing out the available zones through streams
        ZoneId.getAvailableZoneIds().stream()
                .sorted()
                .forEach(i -> System.out.println(i));

    }
}
