public class EnhancedSwitchStatement {

    public static void printDayOfWeek(int day){

        //using switch statement as an expression
        String dayOfWeek = switch (day) {
            case 0 -> "Sunday"; //not using system.out.println because the expression is string
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(day + " stands for " + dayOfWeek);
        //because the method is void so we cant pass the value of the String.
    }

    public static void main(String[] args) {

      printDayOfWeek(0);
      printDayOfWeek(1);
      printDayOfWeek(2);
      printDayOfWeek(3);
      printDayOfWeek(4);
      printDayOfWeek(5);
      printDayOfWeek(6);
      printDayOfWeek(7);

      System.out.println("************************************");

      // using printDayOfWeeks method
        int day = 2;
      System.out.println(day + " stands for " + printDayOfWeeks(day));
    }

    public static String printDayOfWeeks(int day){

        if(day == 0){
            return "Sunday";
        } else if(day ==1) {
            return "Monday";
        }else if(day ==2) {
            return "Tuesday";
        }else if(day ==3) {
            return "Wednesday";
        }else if(day ==4) {
            return "Thursday";
        } else if(day ==5) {
            return "Friday";
        }else if(day ==6) {
            return "Saturday";
        } else {
            return "Invalid day";
        }

    }
}
