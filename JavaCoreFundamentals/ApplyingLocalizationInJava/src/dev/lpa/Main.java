package dev.lpa;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

//  Default Locale
//  Changing default by using set default
        Locale.setDefault(Locale.UK);
        System.out.println("Default Locale = " + Locale.getDefault());

//  Creating Locales
        Locale en = new Locale("en");
        Locale enAU = new Locale("en", "AU");
        Locale enCA = new Locale("en", "CA");

        Locale enIN = new Locale.Builder().setLanguage("en").setRegion("IN").build();
        Locale enNZ = new Locale.Builder().setLanguage("en").setRegion("NZ").build();


        var dtf =
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        for (var locale : List.of(
                Locale.getDefault(), Locale.UK, en, enAU, enCA, Locale.UK, enNZ, enIN
        )) {
            System.out.println(locale.getDisplayName() + "= "
            + LocalDateTime.now().format((dtf.withLocale(locale))));
        }


//  using non-english locales
        DateTimeFormatter wdayMonth = DateTimeFormatter.ofPattern(
                "EEEE, MMMM d, YYYY");

        LocalDate May5 = LocalDate.of(2020, 5, 5);

        System.out.println("-".repeat(30));
        for (var locale : List.of(Locale.CANADA, Locale.CANADA_FRENCH,
                Locale.FRENCH, Locale.GERMANY, Locale.TAIWAN, Locale.JAPAN,
                Locale.ITALY)) {
            System.out.println(
                    locale.getDisplayName() + " : " +
                            locale.getDisplayName(locale) + "=\n\t" +
                            May5.format(wdayMonth.withLocale(locale)));

            System.out.printf(String.format(locale, "\t%1$tA, %1$tB %1$te, %1$tY %n", May5));

//  Decimal number formatting
            NumberFormat decimalInfo = NumberFormat.getNumberInstance(locale);
//  changing decimal places
            decimalInfo.setMaximumFractionDigits(6);
            System.out.println(decimalInfo.format(123456789.123456));

        }


























    }
}
