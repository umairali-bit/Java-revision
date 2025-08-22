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

        average(2,7, false);

        System.out.println("Average is: " + average(2,4, 9));


    }

    void greeting(){
        System.out.println("Hello World");
    }

    static void greet() {
        System.out.println("Greetings");
        System.out.println(4.1);
        System.out.println(4.2);
    }

    public static void average (int a, int b, boolean average) {
        if (!average) {
            System.out.println("Should not take an average");
            return;
        }
        int avg = (a+b)/2;
        System.out.println("Average is: " + avg);
    }

    public static int average(int a, int b, int c) {

        return (a + b + c) /3;
    }


}
