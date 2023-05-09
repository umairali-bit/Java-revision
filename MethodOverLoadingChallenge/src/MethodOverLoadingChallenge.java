public class MethodOverLoadingChallenge {

    // converting feet and inches into centimeters

    public static double convertToCentimeters(int heightFeet, int heightInch) {

        // converting feet into cms and then calling the second methood to calculate inches into cm
        //return (convertToCentimeters((heightFeet * 12)+ heightInch));


        int feetToInches = heightFeet * 12;
        int totalInches = feetToInches + heightInch;
        double result = convertToCentimeters(totalInches);
        return result;


    }


    public static double convertToCentimeters(int heightInch) {


        //return heightInch * 2.54;

        double inchesToCm =(heightInch * 2.54);
        return inchesToCm;
    }


    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");

    }

}
