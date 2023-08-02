public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("suzuki"); //to test our logic in car class in setMake();
        car.setColor("Red");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");
        System.out.println("make = " + car.getMake());
        System.out.println("Color = " + car.getColor());
        car.describeCar();



        //new object car
        Car targa = new Car();
        targa.setMake("porsche"); //to test our logic in car class in setMake();
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("red");

        targa.describeCar();

    }
}
