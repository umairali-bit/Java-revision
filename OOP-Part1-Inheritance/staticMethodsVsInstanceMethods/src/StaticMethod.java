public class StaticMethod {

    class Calculator{
        public static void printSum(int a, int b){
            System.out.println("Sum = " + (a+b));
        }
    }

    public static void main(String[] args) {
        Calculator.printSum(5,6); // static methods are called by className.methodName() or methodName() like printHello()
        printHello();

    // static methods dont require methods
    }

    public static void printHello(){
        System.out.println("hello");
    }
}

