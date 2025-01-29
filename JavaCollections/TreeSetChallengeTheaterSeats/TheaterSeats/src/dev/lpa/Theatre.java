package dev.lpa;

/*
The Seat class should be a nested class on the Theatre class.
A Seat should be constructed with a row character and an integer that represents the seat number within the row.
Each Seat should have a String and a seat number, in the format 'A005', where A is the row number, and 005 is the seat number within the row, and it should be zero padded up to three digits.
Seat should also have a field, a boolean, indicating if the seat is reserved or not.

 */

import java.util.Comparator;
import java.util.Locale;

public class Theatre {

    class Seat implements Comparable<Seat> {

       private String seatNumber;
       private boolean reserved;

        public Seat(char rowChar, int seatNo) {
            this.seatNumber = "%c%d03d".formatted(rowChar,seatNo).toUpperCase();


        }

        @Override
        public String toString() {
            return seatNumber;
        }


        @Override
        public int compareTo(Seat o) {
            return seatNumber.compareTo(o.seatNumber);
        }
    }
}
