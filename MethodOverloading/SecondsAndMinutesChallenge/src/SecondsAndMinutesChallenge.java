public class SecondsAndMinutesChallenge {

    public static String conversion(int seconds){

        //validation code
        if(seconds < 0){
            return"Invalid data for seconds (" + seconds + "), must be a positive integer value";
        }


        int minutes = seconds / 60;
        return conversion(seconds/60, seconds%60);
    }

    public static String conversion(int minutes, int seconds){

        //validation code
        if(minutes < 0){
            return"Invalid data for minutes (" + minutes + "), must be a positive integer value";
        }

        if(seconds <- 0 || seconds >= 59){
            return "Invalid data for seconds (" + seconds + "), must be bewteen 0 and 59";
        }


        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;




        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }


    public static void main(String[] args) {

        // write test cases first
        System.out.println((conversion(-3945)));
        System.out.println(conversion(-65, 45));
        System.out.println(conversion(65, 145));
        System.out.println(conversion(65, 45));
        System.out.println((conversion(3945)));

    }

}
