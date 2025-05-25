package dev.lpa;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.zone.ZoneRules;
import java.util.Locale;

public class Main {

    private record Employee(String name, Locale locale, ZoneId zone) {

        public Employee(String name, String locale, String zone) {
           this(name, Locale.forLanguageTag(locale), ZoneId.of(zone));
        }

        public Employee(String name, Locale locale, String zone) {
            this(name, locale, ZoneId.of(zone));
        }

        String getDateInfo(ZonedDateTime zdt, DateTimeFormatter dtf) {
            return "%s [%s] : %s".formatted(name, zone, zdt.format(dtf.localizedBy(locale)));
        }
    }

    public static void main(String[] args) {


        Employee jane = new Employee("Jane", Locale.US, "America/New_York");
        Employee joe = new Employee("Joe", "en-AU", "Australia/Sydney");

        ZoneRules joesRules = joe.zone.getRules();
        ZoneRules janesRules = jane.zone.getRules();
        System.out.println(jane + " " + janesRules);
        System.out.println(joe + " " + joesRules);



    }
}
