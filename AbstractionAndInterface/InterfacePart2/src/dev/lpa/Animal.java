package dev.lpa;


interface FlightEnabled{

    double Miles_To_KM = 1.60934;
    double KM_TO_Miles = 0.621371;

    void takeoff();
    void land();
    void fly();
}

interface Trackable{
    void track();
}

public abstract class Animal {

    public abstract void move();
}

