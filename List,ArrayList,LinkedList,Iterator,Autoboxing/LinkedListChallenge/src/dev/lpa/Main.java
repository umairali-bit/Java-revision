/*
Create a linked list of places, ordered by distance from starting point.
Use list iterator to move both backwards and forward through this ordered itinerary places
Create  type that has a town or place name, and a field or storing distance om the start
Next create  itinerary of places or town to visit



 */

package dev.lpa;

import java.util.LinkedList;
import java.util.Scanner;

record Place (String name, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class Main {


    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place newYork = new Place("New York",406);
        addPlace(placesToVisit, newYork);

        //checking if duplicates work
        addPlace(placesToVisit, new Place("new York", 406));
        addPlace(placesToVisit, new Place("Virginia", 0));
        addPlace(placesToVisit, new Place("Maryland", 210));
        addPlace(placesToVisit, new Place("Delaware", 272));
        addPlace(placesToVisit, new Place("New Jersey", 374));
        addPlace(placesToVisit, new Place("North Carolina", 158));
        addPlace(placesToVisit, new Place("Florida", 800));


        System.out.println(placesToVisit); //[New York (406)]


        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        InteractivePart.printMenu();

        while(!quitLoop){

            if(!iterator.hasPrevious()){ //printing the start of the list
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }

            if(!iterator.hasNext()){ //printing the end of the list
                System.out.println("Final :" + iterator.previous());
                forward = false;
            }
            System.out.println("Enter Value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0,1); //(select word or letter):

            switch(menuItem){

                case "F": System.out.println("User wants to go forward");

                            if(!forward){                //reversing direction
                                forward = true;
                                if(iterator.hasNext()){
                                    iterator.next();     // Adjusting position forward
                                }
                            }
                            if(iterator.hasNext()) {
                                System.out.println(iterator.next());
                            }
                            break;

                case "B":  System.out.println("User wants to go backwards");

                            if(forward){                //reversing direction
                               forward = false;
                               if(iterator.hasPrevious()){
                                    iterator.previous();     // Adjusting position backward
                            }
                        }

                            if(iterator.hasPrevious()){
                                System.out.println(iterator.previous());
                            }

                            break;

                case "L": System.out.println(placesToVisit);

                            break;

                case "M": InteractivePart.printMenu();

                            break;

                default: quitLoop = true;

                            break;
            }
        }




    }

    // adding place to Place list
    private static void addPlace(LinkedList<Place> list, Place place){

        /*
        //checking duplicates

        if(list.contains(place)){
            System.out.println("Found Duplicate: " + place);
            return;
        }
         */

        //ignoring cases, checking duplicates
        for (Place p : list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found Duplicate : " + place);
                return;
            }
        }

        //adding places according to their distance from VA in ascending order
        int matchedIndex = 0;
        for (var listPlace : list){
            if(place.distance() < listPlace.distance()){
                list.add(matchedIndex,place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }


}
