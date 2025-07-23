package dev.lpa;
/*
In this challenge, your goal is to write a program that uses regular expressions to validate email addresses, based on
the predefined set of rules below.
An email address should be formatted as username@domain.
The username part of the email address can contain alphanumeric characters, so lowercase a to z, upper case A to Z,
digits 0 to 9, dots or periods, underscores, and hyphens or dashes (-).
The domain part of the email address can contain alphanumeric characters and digits, as well as periods or dashes,
such as xyz.com, or abc-xyz.org, but could also be xyz.edu.uk for example.

Your program should:
Use regular expressions and the Pattern class to compile the pattern.
Use the Matcher class to match the entered email address against the compiled pattern.
For valid email addresses, display the username and the domain name, using one of the group methods.
Use the examples shown here, or ones of your own invention, to test your code.

 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String emailText = """
                john.boy@valid.com
                john.boy@invalid
                jane.doe-smith@valid.co.uk
                jane_Doe1976@valid.co.uk
                bob-1964@valid.net
                bob!@invalid.com
                elaine@valid-test.com.au
                elaineinvalid1983@.com
                david@valid.io
                david@invalid..com
                """;

        Pattern partialPattern = Pattern.compile(
                "([\\w.-]+)@(([\\w=]+\\.)+[\\w-]{2,})");

        Matcher emailMatcher = partialPattern.matcher(emailText);
        emailMatcher.results().forEach(mr -> {
            System.out.printf("[username=%s, domain=%s]%n",
                    mr.group(1),
                    mr.group(2));
        });

        Pattern emailPattern = Pattern.compile(
                "([\\\\w.-]+)@(([\\\\w=]+\\\\.)+[\\\\w-]{2,})");

        String[] emailSamples = emailText.lines().toArray(i -> new String[i]);

        for (String email : emailSamples) {
            Matcher eMatcher  = emailPattern.matcher(email);
            boolean matched = eMatcher.matches();
            if (matched) {
                System.out.printf("[username=%s, domain=%s]%n",
                        eMatcher.group(1),
                        eMatcher.group(2));
            } else {
                System.out.println();
            }
        }
    }
}
