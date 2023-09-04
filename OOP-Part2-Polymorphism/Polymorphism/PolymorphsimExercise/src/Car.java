public class Car {

    String name;
    String instanceType = this.getClass().getSimpleName();

    public Car(String name) {
        this.name = name;
    }

    public void startEngine(){

        System.out.println( name + " is a type of " + instanceType);


    }
    public void drive(){
        System.out.println(name + " is ready to drive ");


    }
    protected void runEngine(){
        System.out.println(name + " engine is running. It is a " + instanceType + " engine.");
    }

    //factory calling method
    public static Car getCar(String type, String name){
        return switch(type.toUpperCase().charAt(0)){
            case 'G' -> new GasPoweredCar(name);
            case 'E' -> new ElectricCar(name);
            case 'H' -> new HybridCar(name);
            default -> new Car(name);
        };
    }
}

class GasPoweredCar extends Car{
    private double avgKmPrLiter = 50.3;
    private int cylinders = 4;


    public GasPoweredCar(String name) {
        super(name);

    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println(name + " is a " + cylinders + " cylinder car." +
                name + " has the avg of " + avgKmPrLiter + " Km/Liter."
        );
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}

class ElectricCar extends Car{

    private double avgKmPrCharge = 120;
    private int batterySize = 82;

    public ElectricCar(String name) {
        super(name);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println(name + " is a battery based car. " +
                name + " has the avg of " + avgKmPrCharge + "Volt" +
                " with battery size of " + batterySize +"kWh"
        );
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }


}

class HybridCar extends Car{

    private double avgKmPrLiter =29;
    private int batterySize = 18;
    private int cylinders =6;

    public HybridCar(String name) {
        super(name);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println(name + " is a hybrid car. " +
                name + " has the avg of " + avgKmPrLiter + "/km" +
                " with battery size of " + batterySize +"kWh. It is a " + cylinders + " cylinder car."
        );
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}
