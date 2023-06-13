import java.util.Scanner;


public class pasingValuesAndReadinginput {

    public static void main(String[] args) {




        /*
        String currentYear = "2022";
        String usersDateOfBirth = "1999";

        Syetem.out.println("Age = " (currentYear - usersDateOfBirth); // not allowed
         */

        int currentYear = 2023;
        String usersDateOfBirth = "1999";

        // to convert a String into an int
        int dateOfBirth = Integer.parseInt(usersDateOfBirth);

        System.out.println("Age = " + (currentYear - dateOfBirth));


        // samething with double
        String usersAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        System.out.println("The user says he's " + ageWithPartialYear);

        /****************************************************************/

        // reading input from console and scanner class
        int currentYear2 = 2022;


        //exception handeling
        // runnig this program will console give us an exception, we need to use terminal to run this
        // program. In order to run this program from either console or scanner
        // we will throw exception handeling
        try {
            System.out.println(getInputFromScanner(currentYear2));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear2));
        }

    }

/*    // reading from console and getting name and age
    public static String getInputFromConsole(int currentYear2) {

        String name = System.console().readLine("Hi, Whats your Name?");
        System.out.println("Hi " + name + ", Thanks for taking the course!");


        String dateOfBirth = System.console().readLine("What year were you born? ");



        int age = currentYear2 - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old ";


    }*/


    // reading from Scanner class
    // to use Scanner class we need to import java.util.Scanner
    public static String getInputFromScanner(int currentYear2) {

        Scanner scanner = new Scanner(System.in);

        //String name = System.console().readLine("Hi, Whats your Name?");
        System.out.println("Hi, What's your Name");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course!");


        //String dateOfBirth = System.console().readLine("What year were you born? ");
        System.out.println("What year were you born");
        boolean validDOB = false;
        int age = 0;

        do{
            System.out.println("Enter a year of birth >= " +
                    (currentYear2 - 125) + " and <= " + (currentYear2));
            //getting the data from checkData and using it for validation
            try {
                age = checkData(currentYear2, scanner.nextLine());
                validDOB = age < 0 ? false : true;

            } catch (NumberFormatException badUserData) {
                System.out.println("Character are not allowed!!! Try again. ");
            }
        } while (!validDOB);



       return "So you are " + age + " years old ";

    }
        public static int checkData(int currentYear2, String dateOfBirth) {

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear2 -125;

        if((dob < minimumYear) || (dob > currentYear2)){
            return -1;

        }
        return (currentYear2 - dob);

        }

}
