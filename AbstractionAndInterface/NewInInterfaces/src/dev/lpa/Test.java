package dev.lpa;

public class Test {

    public static void main(String[] args) {

        inFlight(new Jet());

        System.out.println("-".repeat(30));
        inFlight(new Bird());
        System.out.println("-".repeat(30));
        OrbitEarth.log(" Testing " + new Satellite());

        orbit(new Satellite());



    }

    public static void inFlight(FlightEnabled flier) {

        flier.transition(FlightStages.LAUNCH);
        flier.takeoff();
        flier.fly();


        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    public static void orbit(OrbitEarth flier) {


        flier.takeoff();
        flier.fly();
        flier.land();
    }
}
