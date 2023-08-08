public class Main {

    public static void main(String[] args) {



    House blueHouse = new House("Blue");// calling the constructor and instantiating an object
    House anotherHouse = blueHouse;


    System.out.println(blueHouse.getColor());// blue
    System.out.println(anotherHouse.getColor());// blue


        anotherHouse.setColor("Red");
        System.out.println(anotherHouse.getColor());// red
        System.out.println(blueHouse.getColor());// red

        House greenHouse = new House("Green");
        anotherHouse = greenHouse;
        System.out.println(blueHouse.getColor()); // red
        System.out.println(greenHouse.getColor()); // green
        System.out.println(anotherHouse.getColor()); // greem



    }

}
