public class Main {

    public static void main(String[] args) {

        /* using the constructor in the GasPoweredCar class
           the output tells us that car's method were called but actual runtime type is gaspoweredcar cuz we
           used .getClass().getSimpleName()
         */

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4,6);
        runRace(ferrari);
        Car tesla = new ElectricCar("2022 Red Tesla model 3",568, 75 );
        runRace(tesla);
        Car ferrariHybrid = new HybridCar("2022 Black SF90 Ferrari 296", 16,8,8);
        runRace(ferrariHybrid);

    }

    //creating a method that will take a Car parameter
    public static void runRace(Car car){
        car.startEngine();
        car.drive();

    }
}
