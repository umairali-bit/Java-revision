public class Main {

    public static void main(String[] args) {


        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and goodbye");

        // StringBuilder helloWorldBuilder = "Hello " + "World"; not going to compile. We need to use the constructor

        StringBuilder helloWorldBuilder = new StringBuilder("Hello " + "World");
        helloWorldBuilder.append(" and goodbye!");


        printInformation(helloWorld);// prints out Hello World
        printInformation(helloWorldBuilder);// prints out Hello World and goodbye

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));
        printInformation(emptyStart);
        printInformation(emptyStart32);


        StringBuilder builderPlus = new StringBuilder("Hello " + "World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16,'g');//prints out Hello world and goodbye instead of Hello world and Goodbye
        System.out.println(builderPlus);

        builderPlus.replace(16,17,"G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);// prints out eybdooG (Goodbye in reverse)




    }
    //create overloaded methods
    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(StringBuilder stringBuilder){
        System.out.println("String = " + stringBuilder);
        System.out.println("length = " + stringBuilder.length());
        System.out.println("capacity = " + stringBuilder.capacity());
    }
}
