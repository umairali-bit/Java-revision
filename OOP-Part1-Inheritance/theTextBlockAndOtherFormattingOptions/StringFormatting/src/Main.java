public class Main {
    public static void main(String[] args) {

        //pre JDK 15 way
        String bulletIt = "Print a bulleted List:"+
                "\u2022 First Point "+
                "\u2022 Second Point ";

        System.out.println(bulletIt);

        //another way
        String bulletItPlease = "Print a bulleted List:\n"+
                "\t\u2022 First Point \n"+
                "\t\t\u2022 Second Point \n";

        System.out.println(bulletItPlease);

        //new way
        String textBlock = """
               Print a bulleted List:
                \u2022 First Point
                    \u2022 Second Point""";
        System.out.println(textBlock);


        //formatting numbers in text
        int age = 35;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2023-age;
        System.out.printf("Age = %d, Birthyear = %d%n", age, yearOfBirth);
        //%.2f ifyou want two decimal places
        System.out.printf("Your age is %.2f%n", (float)age);


        for (int i =1; i<1000000; i*= 10){
            System.out.printf("Printing %6d %n", i);

        }

        for(int j = 1; j<1000000; j*=10){
            System.out.println("Printing" + j);
        }


        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);


        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

        System.out.println("----------------------");

        printInformation(bulletItPlease);
        printInformation("Hello World");



    }
    public static void printInformation(String string){

        int length = string.length();
        System.out.printf("Length = %d %n", length);

        //%c prints out a single character
        System.out.printf("First char = %c %n", string.charAt(0));

    }
}
