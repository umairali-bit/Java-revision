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
import java.util.Set;
import java.util.TreeSet;

public class Theatre {

    class Seat implements Comparable<Seat> {

       private String seatNumber;
       private boolean reserved;

        public Seat(char rowChar, int seatNo) {
            this.seatNumber = "%c%03d".formatted(rowChar,seatNo).toUpperCase();


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
            //adding the seats to Seat
            seats.add(new Seat(rowChar, seatInRow));

        }
    }

    public void printSeatMap() {
        String separatorLine = "-".repeat(90);
        System.out.printf("%1$s%n%2$s Seat Map%n%1$s%n", separatorLine, theatreName);


        int index = 0;
        for (Seat s : seats) {
            System.out.printf("%-8s%s", s.seatNumber + ((s.reserved) ? "(\u25cf)" : ""),
                    ((index++ + 1) % seatsPerRow == 0) ? "\n" : "");//include a new line character at the end of seat in a row by using %

        }
        System.out.println(separatorLine);
    }

    public String reverseSeat(char row, int seat) {

        Seat requestedSeat = new Seat(row, seat);
        Seat requested = seats.floor(requestedSeat);

        if (requested == null || !requested.seatNumber.equals(requestedSeat.seatNumber)) {
            System.out.print("--> NO such Seat " + requestedSeat);
            System.out.printf(": Seat must be between %s and %s%n",
                    seats.first().seatNumber, seats.last().seatNumber);
        } else {
            if (!requested.reserved) {
                requested.reserved = true;
                return requested.seatNumber;
            } else {
                System.out.println("Seat's already reserved.");
            }
        }
        return null;
    }
    /*
        If you want an extra challenge, create a second method on Theatre, that lets an agent specify:
        The number of reservations being requested.
        A range of rows (from A to C for example, for front row seats).
        A range of seats (a number greater than or equal to 1, and less than or equal to the total number of rows per seat).
        The seats that get reserved should be contiguous within a row.
     */

    private boolean validate (int count, char first, char last, int min, int max) {

        boolean result = (min > 0 || seatsPerRow >= count || (max - min + 1) >= count);
        result = result && seats.contains(new Seat(first, min));
        if (!result) {
            System.out.printf("Invalid! %1$d seats between " + "%2$c[%3$d-%4$d]-5$c[%3$d-%4$d] Try again", count, first
                    , min, max, last);
            System.out.printf(": Seat must be between %s and %s%n",
                    seats.first().seatNumber,seats.last().seatNumber);
        }
        return result;
    }

    public Set<Seat> reserveSeats(int count, char minRow, char maxRow, int minSeat, int maxSeat) {


        char lastValid = seats.last().seatNumber.charAt(0);
        maxRow = (maxRow < lastValid) ? maxRow : lastValid;

        if(!validate(count, minRow, maxRow, minSeat, maxSeat)) {
            return null;
        }

        NavigableSet<Seat> selected = null;

        for (char letter = minRow; letter <= maxRow; letter++) {

            NavigableSet<Seat> contigous = seats.subSet(
                    new Seat(letter, minSeat), true,
                    new Seat(letter, maxSeat), true);


                    int index = 0;
                    Seat first = null;
                    for (Seat current : contigous) {
                        if (current.reserved) {
                            index = 0;
                            continue;
                        }
                        first = (index == 0) ? current : first;
                        if(++index == count) {
                            selected = contigous.subSet(first, true, current, true);

                            break;
                        }
                    }

                    if (selected != null) {
                        break;

            }

        }
        Set<Seat> reservedSeats = null;
        if (selected != null) {
            selected.forEach(s-> s.reserved = true);
        }

    }

}
