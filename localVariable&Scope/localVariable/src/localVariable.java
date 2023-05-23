public class localVariable {

    // In scope example

    { // Starts on outer block - for example a method block
        int firstVariable = 5;
        int secondVariable = 10;

        if (firstVariable > 0) { // flow statement block starts inner block

            // Inner block code has access to outer block's varibales
            System.out.println(secondVariable);
        }
    }


    // Out of scope example

    public static void aMethod(boolean aBoolean) {
        if (aBoolean) {
            int myCounter = 10; // myCounter is local in this block
        }
        System.out.println(myCounter); // myCounter is out of scope in here
    }

    // out of scope for example

    public static void forLoop(){
        for (int i = 1; i <= 5; i++){ // i declared in for loop declaration
            System.out.println(i);
        }
        System.out.println(i); // out of scope
    }


    // if statements out of scope example

    public static void ifStatment(int counter){

        if(counter > 0) {
            int i = 10;
        } else {
            System.out.println(i); // ERROR: i is out of scope
        }
        System.out.println(i); // Error: i is out of scope
    }

    // switch statement is different then for and if blocks

    public static void switchStatement(int value) {
        switch (value) { // this brace is optional

            case 1: int i = 10;
            break;

            default:
                i =  value;         // this is ok unless the i is decalred above not below
                System.out.println(i);          // this is ok
                break;

        }

        System.out.println(i);
    }




}
