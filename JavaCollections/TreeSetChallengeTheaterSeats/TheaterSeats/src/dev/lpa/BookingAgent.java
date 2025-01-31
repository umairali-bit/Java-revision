package dev.lpa;

/*
In this challenge, you'll be creating a Theatre class that has a Set of Seats.
The Seat class should be a nested class on the Theatre class.
A Seat should be constructed with a row character and an integer that represents the seat number within the row.
Each Seat should have a String and a seat number, in the format 'A005', where A is the row number, and 005 is the seat number within the row, and it should be zero padded up to three digits.
Seat should also have a field, a boolean, indicating if the seat is reserved or not.


The Theatre class should have three fields, theatre name, an integer for seats in each row, how many seats are in a single row in other words, and a field for the seats themselves.
This last field should be a TreeSet.
A Theatre instance should be constructed with the theatre name, the number of rows in the theatre, and the number of seats total in the theatre.
For simplicity, assume there are a uniform number of seats in every row, and the number of rows should never exceed 26, so the rows will be labeled A through Z.


You should create the seats and number them, as part of the initialization of a Theatre class.
The Theatre class should also have a printSeatMap method, that prints each seat, with each row printed on a separate line.
You should allow a booking agent to reserve a single seat, and the printedSeatMap method should show which seats are reserved.


If you want an extra challenge, create a second method on Theatre, that lets an agent specify:
The number of reservations being requested.
A range of rows (from A to C for example, for front row seats).
A range of seats (a number greater than or equal to 1, and less than or equal to the total number of rows per seat).
The seats that get reserved should be contiguous within a row.


 */

public class BookingAgent {

    public static void main(String[] args) {


        int rows = 10;
        int totalSeats = 100;

        Theatre nyc = new Theatre("Richard Rodgers", rows, totalSeats);

        nyc.printSeatMap();

        bookSeat(nyc, 'b', 15);

        bookSeats(nyc, 4, 'B', 3, 10);
    }

    private static void bookSeat(Theatre theatre, char row, int seatNumber) {

        String seat = theatre.reverseSeat(row, seatNumber);

        if (seat != null) {
            System.out.println("Congratulations! Your reserved seat is " + seat);
            theatre.printSeatMap();
        } else {
            System.out.println("Sorry! Unable to reserve " + row + seatNumber);
        }
    }

    private static void bookSeats(Theatre theatre, int tickets, char minRow, int minSeat, int maxSeat) {

        bookSeats (theatre, tickets, minRow, minRow, minSeat, maxSeat);
    }

    private static void bookSeats (Theatre theatre, int tickets, char minRow, char maxRow, int minSeat, int maxSeat) {

        var seats = theatre.reserveSeats(tickets, minRow, maxRow, minSeat, maxSeat);
        if (seats != null) {
            System.out.println("Congratulations! Your reserved seats are " + seats);
            theatre.printSeatMap();
        } else {
            System.out.println("Sorry! No matching contigous seats in rows: " + minRow + " _ " + maxRow);
        }
    }
}
