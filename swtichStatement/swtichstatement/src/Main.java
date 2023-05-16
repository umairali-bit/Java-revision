public class Main {

    public static void main(String[] args) {

        int value = 3;

        switch (value) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

                //shotcut
            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + value);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;

        }

        // cannot use long, float, double or boolean or their wrappers.



        //enhanched switch statement

        int newValue = 4;

        switch (newValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");


            //shotcut
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + value);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }

        String month ="xyz";
        System.out.println(month + " is in the " +getQuater(month) + " quater");
    }

    public static String getQuater(String month){

        return switch (month) {
            case "JANUARY", "FEBURARY", "MARCH" -> {yield "1st";} 
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
           // default -> "bad";

            default -> {
                String badResponse = month + " is bad ";
                //return badResponse;
                yield badResponse;
            }
        };

    }
}
