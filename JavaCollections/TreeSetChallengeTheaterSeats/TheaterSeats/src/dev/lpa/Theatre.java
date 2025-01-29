package dev.lpa;

/*
The Seat class should be a nested class on the Theatre class.
A Seat should be constructed with a row character and an integer that represents the seat number within the row.
Each Seat should have a String and a seat number, in the format 'A005', where A is the row number, and 005 is the seat number within the row, and it should be zero padded up to three digits.
Seat should also have a field, a boolean, indicating if the seat is reserved or not.

The Theatre class should have three fields, theatre name, an integer for seats in each row, how many seats are in a single row in other words, and a field for the seats themselves.
This last field should be a TreeSet.

 */


import java.util.NavigableSet;
import java.util.TreeSet;

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

    private String theatreName;
    private int seatsPerRow;
    private NavigableSet<Seat> seats; //collection for the theatre seats

    public Theatre(String theatreName, int rows, int totalSeats) {
        this.theatreName = theatreName;
        this.seatsPerRow = totalSeats/rows;

        seats = new TreeSet<>();
        for (int i = 0; i < totalSeats; i ++) {
            char rowChar = (char) ( i / seatsPerRow + (int) 'A');// itll be A, B, C
            //to find the seat in the row
            int seatInRow = i % seatsPerRow + 1;
            //adding the seats to seat
            seats.add(new Seat(rowChar, seatInRow));

        }
    }
}
