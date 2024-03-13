package dev.lpa;

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
    }

    public static void inFlight(FlightEnabled flier){

        flier.takeoff();
        flier.fly();

        if(flier instanceof Trackable tracked){
            tracked.track();
            flier.land();
        }

    }


}

