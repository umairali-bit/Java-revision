package dev.lpa;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

//  changing the time zone in JVM to America/Los_Angeles at runtime
        System.setProperty("user.timezone", "America/Los_Angeles");

//  Zone ID class gives the time zone you are in
        System.out.println(ZoneId.systemDefault());//America/New_York

//  How many time zones are available
        System.out.println("Number of TZs = " + ZoneId.getAvailableZoneIds().size());//Number of TZs = 602

//  printing out the available zones through streams

        //converting the stream into a list to get indexing
        List<ZoneId> usZoneId = ZoneId.getAvailableZoneIds().stream()
                //filtering available in US
                .filter(s -> s.startsWith("US"))
                .sorted()
                //creating a new instance of zone ID passing it the current String
                .map(s -> ZoneId.of(s))
                .collect(Collectors.toList());

//  applying indexing by using IntStream.range(1, usZoneID.size())
         IntStream.range(1, usZoneId.size())
//  printing out the rules for the zones
        .forEach(i -> {
            ZoneId zone = usZoneId.get(i);
            System.out.println(i + ": " + zone.getId() + ": " + zone.getRules());
        });

//  printing locate date time according to Los_Angeles
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

//  Instant class
        Instant instantNow = Instant.now();
        System.out.println(instantNow);


        for (ZoneId z : List.of(
                ZoneId.of("Australia/Sydney"),
                ZoneId.of("Europe/Paris"),
                ZoneId.of("America/New_York"))) {
            DateTimeFormatter zoneFormat = DateTimeFormatter.ofPattern("z:zzzz");
            System.out.println(z);
            System.out.println("\t" + instantNow.atZone(z).format(zoneFormat));
            System.out.println("\t" + z.getRules().getDaylightSavings(instantNow));
            System.out.println("\t" + z.getRules().isDaylightSavings(instantNow));
        }

        Instant dobInstant = Instant.parse("2020-01-01T08:01:00Z");
        LocalDateTime dob =
                LocalDateTime.ofInstant(dobInstant, ZoneId.systemDefault());

        System.out.println("Your kid's birthday, LA time = " + dob.format(
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)//Your kid's birthday, LA time = Jan 1, 2020, 12:01:00 AM
        ));

    }
}
