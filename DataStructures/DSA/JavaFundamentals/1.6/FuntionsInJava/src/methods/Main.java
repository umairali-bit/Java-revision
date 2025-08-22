package methods;

public class Main {

    public static void main(String[] args) {

        //greeting(); not going to work
       // System.out.println(greeting()); not going to work

        //make an object of the class
        Main main = new Main();
        main.greeting();

        greet();//works because we can call static methods


    }

    void greeting(){
        System.out.println("Hello World");
    }

    static void greet() {
        System.out.println("Greetings");
    }


}
