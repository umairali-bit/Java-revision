package dev.lpa;

import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
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

        ZonedDateTime dobSydney = ZonedDateTime.ofInstant(dobInstant,
                ZoneId.of("Australia/Sydney"));
        System.out.println("Your kid's birthdate, Sydney Time = " + dobSydney.format(
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
        ));

        ZonedDateTime dobHere = dobSydney.withZoneSameInstant(ZoneId.systemDefault());
        System.out.println("Your kid's birthdate, Here Time = " + dobHere.format(
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
        ));

//  TemporalAdjuster, for example we want to know when the first day of the month is, starting today
        ZonedDateTime firstOfMonth = ZonedDateTime.now()
                .with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.printf("First of next Month = %tD %n", firstOfMonth);//First of next Month = 06/01/25


//  Difference between EPOCH date and LocalDate
        Period timePast = Period.between(LocalDate.EPOCH, dob.toLocalDate());
        System.out.println(timePast);//P50Y


//  Difference between EPOCH time and local time
        Duration timeSince =
                Duration.between(Instant.EPOCH, dob.toInstant(ZoneOffset.UTC));
        System.out.println(timeSince);//PT438288H1M

//  Chaining plus methods
        LocalDateTime dob2 = dob.plusYears(2).plusMonths(4)
                .plusDays(4).plusHours(7).plusMinutes(14)
                .plusSeconds(37);


        System.out.println("Your 2nd kid's birthdate, Here Time = " + dob2.format(
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
        ));

        Period timePast2 = Period.between(LocalDate.EPOCH, dob2.toLocalDate());
        System.out.println(timePast2);//P52Y4M4D

//  LocateDate has days, weeks, months and so on
        Duration timeSince2 =
                Duration.between(Instant.EPOCH, dob2.toInstant(ZoneOffset.UTC));
        System.out.println(timeSince2);//PT458815H15M37S


        for (ChronoUnit u : ChronoUnit.values()) {
            if (u.isSupportedBy(LocalDate.EPOCH)) {
                long val = u.between(LocalDate.EPOCH,
                        dob2.toLocalDate());
                System.out.println(u + " past = " + val);
            } else {
                System.out.println("-----Not supported: " + u);
            }
        }
//  LocalDateTime shows time, days, weeks and so on
        LocalDateTime ldt = LocalDateTime.ofInstant(Instant.EPOCH,
                ZoneOffset.UTC);


        for (ChronoUnit u : ChronoUnit.values()) {
            if (u.isSupportedBy(ldt)) {
                long val = u.between(ldt,
                        dob2);
                System.out.println(u + " past = " + val);
            } else {
                System.out.println("-----Not supported: " + u);
            }
        }



    }
}
