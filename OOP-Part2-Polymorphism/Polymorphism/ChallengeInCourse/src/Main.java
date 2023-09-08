public class Main {

    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);


        // using the constructor in the GasPoweredCar class
        //the output tells us that car's method were called but actual runtime type is gaspoweredcar cuz we used .getClass().getSimpleName()
        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4,6);
        runRace(ferrari);

    }

    //creating a method that will take a Car parameter
    public static void runRace(Car car){
        car.startEngine();
        car.drive();

    }
}
