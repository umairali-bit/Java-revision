/*
Create a linked list of places, ordered by distance from starting point.
Use list iterator to move both backwards and forward through this ordered itinerary places
Create  type that has a town or place name, and a field or storing distance om the start
Next create  itinerary of places or town to visit


 */

package dev.lpa;

import java.util.LinkedList;

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
        addPlace(placesToVisit, new Place("Maryland", 210));
        addPlace(placesToVisit, new Place("Delaware", 272));
        addPlace(placesToVisit, new Place("New Jersey", 374));
        addPlace(placesToVisit, new Place("North Carolina", 158));
        addPlace(placesToVisit, new Place("Florida", 800));


        System.out.println(placesToVisit); //[New York (406)]



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
