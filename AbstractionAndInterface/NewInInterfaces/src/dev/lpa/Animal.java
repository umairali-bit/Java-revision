package dev.lpa;


enum FlightStages implements Trackable {GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {

        if( this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage(){

        FlightStages [] allStages = values();
        return allStages[(ordinal()+1) % allStages.length];
    }



}

record DragonFly(String name, String type) implements FlightEnabled {

    @Override
    public void takeoff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Satellite implements OrbitEarth{

    public void achieveOrbit(){
        System.out.println("Orbit achieved!");
    };

    @Override
    public void takeoff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

}



interface OrbitEarth extends FlightEnabled{
    void achieveOrbit();

    static void log(String description) {
        var today = new java.util.Date(); //use of var, the Java compiler infers the type from the variable’s initial value
        System.out.println(today + ": " + description);
    }

}


interface FlightEnabled{

    double MILES_TO_KM = 1.60934;
    double KM_TO_Miles = 0.621371;

    void takeoff();
    void land();
    void fly();

    //abstract method used in interface before JDK 8. This method will change every class that implements FlightEnabled Interface
    // FlightStages transition(FlightStages stage);

    //using default method to solve this problem
    default FlightStages transition (FlightStages stage) {
//        System.out.println("transition not implemented on " + getClass().getName());
//        return null;

        FlightStages nextStage = stage.getNextStage(); //stage.getNextStage (calling a method on an object)
        System.out.println("Transitioning from " + stage + " to " + nextStage );
        return nextStage;


    }

}

interface Trackable{
    void track();
}

public abstract class Animal {

    public abstract void move();
}


