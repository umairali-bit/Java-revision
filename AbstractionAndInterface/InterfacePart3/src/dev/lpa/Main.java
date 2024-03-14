package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //usual way to create an instance of a bird
        Bird bird = new Bird();

        /*
        bird is an animal and is FlightEnabled and trackable
         */

        //assigning bird object to animal
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move();
//        tracked.move();

//        flier.takeoff();
//        flier.fly();
//        flier.land();
//        tracked.track();

        inFlight(flier);
        inFlight(new Jet());

        Truck truck = new Truck();
        truck.track();


        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_Miles;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n", kmsTraveled, milesTraveled);


        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new ArrayList<>();
        betterFliers.add(bird);






    }

    public static void inFlight(FlightEnabled flier){

        flier.takeoff();
        flier.fly();

        if(flier instanceof Trackable tracked) {
            tracked.track();
        }
            flier.land();
        }

        private static void triggerFliers(ArrayList<FlightEnabled> fliers){

            for( var flier : fliers){
                flier.takeoff();

        }

    }


}


