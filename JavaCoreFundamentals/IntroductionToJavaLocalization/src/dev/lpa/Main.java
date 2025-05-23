package dev.lpa;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
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







    }
}
