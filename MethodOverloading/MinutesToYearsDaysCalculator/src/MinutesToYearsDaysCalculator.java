import java.util.Scanner;

public class MinutesToYearsDaysCalculator {


    public static void printYearsAndDays(long minutes){

        long hours;
        long days;
        long years;


        days = (minutes/60/24);
        years = (days/365);
        long remainingDays = days % 365;

        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {

            //System.out.println((minutes < 0 ? "Invalid Value" : minutes + " min = " + (int) years + " y and " + (int) remainingDays + " d"));
            System.out.println(minutes + " min = "+ years + " y and " + remainingDays +" d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(525600);
    }
}
