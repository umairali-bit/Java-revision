package dev.lpa;

import java.util.Arrays;

public interface Mappable {

    // adding an abstract method
    void render();


    //jdk gave us method with both static and private on interface
    static double[] stringToLatLon(String location) {

        // split the array by comma
        var splits = location.split(",");

        //first element of the array is latitude
        double lat = Double.valueOf(splits[0]);
        //second element of the array is longitude
        double lng = Double.valueOf(splits[1]);

        //returning a lat,lng as two points
        return new double[]{lat, lng};

    }

}

//abstract class Point
abstract class Point implements Mappable{

    private double[] location = new double[2]; // two elements (lat,lng)

    //constructor
    public Point(String location) {
        this.location = Mappable.stringToLatLon(location);
    }

    @Override
    public void render() {

        System.out.println("Render " + this + " as POINT (" + location() + ")"); //call to the location();

    }

    //private method location that prints the location by points
    private String location() {
        return Arrays.toString(location);
    }
}
