

    class Dog{
        private static String name; // declaraing a static variable

        //constructor

        public Dog(String name){
            Dog.name = name;
        }

        public void printName(){
            System.out.println("name " + name);
        }

    }

    public class Main{
        public static void main(String[] args) {
            Dog rex = new Dog("rex");
            Dog fluffy = new Dog("fluffy");
            rex.printName(); // prints fluffy
            fluffy.printName();// print fluffy
            // Once we change a static variable all instances are going to see that change. Thats why fluffy and fluffy was printed
        }
    }





