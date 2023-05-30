public class pasingValuesAndReadinginput {

    public static void main(String[] args) {




        /*
        String currentYear = "2022";
        String usersDateOfBirth = "1999";

        Syetem.out.println("Age = " (currentYear - usersDateOfBirth); // not allowed
         */

        int currentYear = 2022;
        String usersDateOfBirth = "1999";

        // to convert a String into an int
        int dateOfBirth = Integer.parseInt(usersDateOfBirth);

        System.out.println("Age = " + (currentYear - dateOfBirth));


        // samething with double
        String usersAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        System.out.println("The user says he's " + ageWithPartialYear);



        // reading input from console and scanner class
        int currentYear2 = 2022;

        System.out.println(getInputFromConsole(currentYear2));
        System.out.println(getInputFromScanner(currentYear2));


    }
    // reading from console and getting name and age
    public static String getInputFromConsole (int currentYear2){

        String name = System.console().readLine("Hi, Whats your Name?");
        System.out.println("Hi " + name + ", Thanks for taking the course!");


        String dateOfBirth = System.console().readLine("What year were you born? ");

        int age = currentYear2 - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old ";



    }


    // reading from console
    public static String getInputFromScanner (int currentYear2){



        return "";
    }



}
