package external.util;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Logger {

    public static void logToConsole(CharSequence message) { //CharSequence can take either a String or a StringBuilder


        //to get current date and time
        LocalDateTime dt = LocalDateTime.now();
        System.out.printf("%1$tD %1$tT : %2$s%n", dt, message);
        





    }
}
