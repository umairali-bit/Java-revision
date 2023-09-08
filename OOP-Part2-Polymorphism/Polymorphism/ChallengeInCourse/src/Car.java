public class Car {

    private String description;

    //constructor

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> startEngine");

    }

    protected void runEngine(){
        System.out.println("Car -> runEngine");

    }

    //printing out the runtime type
    public void drive(){
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();

    }
}

class GasPoweredCar extends Car{

    private double avgKmPerLiter;
    private int cylinders = 6;

    //constructor without any arguments
    public GasPoweredCar(String description) {
        super(description);
    }

    //constructor with arguments to pass the number of cylinders and avgKmPerLiter for GasPoweredClass
    // now we can create an instance of this kind of car in the main method and execute the runrace() on it
    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    //overriding methods

    @Override
    public void startEngine() {
        // way to call the super class methods
        super.startEngine();
        System.out.printf("Gas -> All %d cylinders are fired up, Ready! %n", cylinders);
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}
