package methods;

public class Main {

    public static void main(String[] args) {

        //greeting(); not going to work
       // System.out.println(greeting()); not going to work

        //make an object of the class
        Main main = new Main();
        main.greeting();

        greet();//works because we can call static methods

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        greet();
        System.out.println(5);
        System.out.println(6);


    }

    void greeting(){
        System.out.println("Hello World");
    }

    static void greet() {
        System.out.println("Greetings");
        System.out.println(4.1);
        System.out.println(4.2);
    }


}
