public class NextMain {
    public static void main(String[] args) {
        //hard coded the arguments
        Car StatCar = Car.getCar("E", "Rivian");
        StatCar.startEngine();

        //GasPoweredCar kia = Car.getCar("G","Kia");
        GasPoweredCar kia = (GasPoweredCar)Car.getCar("G", "Kia");
        kia.startEngine();

        //Assigning Object to a reference that is of type Object.
        Object electricCar = Car.getCar("E", "Ionic 5");
        Car electricCars = (Car)(electricCar);
        electricCars.startEngine();


        //type inference
        var tesla = Car.getCar("E","Tesla");
        tesla.startEngine();

        //example of creating an inference
        var suzuki = new GasPoweredCar("Suzuki");
        suzuki.style();


    }
}
