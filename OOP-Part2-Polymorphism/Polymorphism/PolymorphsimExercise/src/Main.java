import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Car");
        car.startEngine();
        car.drive();
        car.runEngine();

        System.out.println("******************************");

        Car theCar = new GasPoweredCar("Hyundai");
        theCar.startEngine();
        theCar.drive();
        theCar.runEngine();

        System.out.println("******************************");

        Car theElectricCar = new ElectricCar("Tesla");
        theElectricCar.startEngine();
        theElectricCar.drive();
        theElectricCar.runEngine();

        System.out.println("******************************");


        Car theHybridCar = new HybridCar("Toyota Hybrid");
        theHybridCar.startEngine();
        theHybridCar.drive();
        theHybridCar.runEngine();

        System.out.println("******************************");


        //static method calling
        Car staticCar = Car.getCar("G", "Nissan Altima");
        staticCar.startEngine();

        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Enter a type of  car (G for Gas powered cars. " +
                    "H for Hybrid cars, and E for Electric cars or Q for Quit:)");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter description of ther car");
            String name = s.nextLine();

            Car facCar = Car.getCar(type,name);
            facCar.startEngine();
            facCar.runEngine();
            facCar.drive();
        }
    }
}
