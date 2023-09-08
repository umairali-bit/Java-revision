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


        //3 testing runtime methods
        //assigning the object to a reference that is type of a Object
        Object unknownObject = Car.getCar("H","Prius");
        //Method 1
        if(unknownObject.getClass().getSimpleName()=="HybridCar"){
            HybridCar hybrid = (HybridCar) unknownObject;
            hybrid.drive();

            //method 2
        } else if(unknownObject instanceof GasPoweredCar){
            ((GasPoweredCar) unknownObject).drive();
        }

        //method 3
        else if (unknownObject instanceof ElectricCar elyktrik){
            elyktrik.drive();
        }



    }
}
