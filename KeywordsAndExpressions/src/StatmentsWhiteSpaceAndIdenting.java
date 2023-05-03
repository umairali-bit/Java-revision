public class StatmentsWhiteSpaceAndIdenting {

    public static void main(String[] args) {
        int myVariable = 50;

        myVariable += 2; //gives 52
        myVariable--; //gives 51

        System.out.println("This is a test: " + myVariable);

        // could also be written as
        System.out.println("This is" +
                " another" +
                " still more.");


        int anotherVariable1 = 50;anotherVariable1--;System.out.println("anotherVariable1 = " + anotherVariable1); //its valid

        int anotherVariable2 = 50;
        anotherVariable2--;
        System.out.println("anotherVariable2e = " + anotherVariable2); //formatted line 17


        if (myVariable == 51) {
            System.out.println("It is now zero");
        }


    }

}
