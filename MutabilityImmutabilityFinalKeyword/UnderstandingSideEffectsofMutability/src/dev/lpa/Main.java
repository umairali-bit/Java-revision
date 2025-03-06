package dev.lpa;

import cosnumer.specific.ChildClass;
import dev.lpa.generic.BaseClass;
import external.util.Logger;

public class Main {

    public static void main(String[] args) {

        BaseClass parent = new BaseClass();
        ChildClass child = new ChildClass();

        BaseClass childReferredToAsBase = new ChildClass();

        parent.recommendedMethod();
        System.out.println("-".repeat(50));
        childReferredToAsBase.recommendedMethod();
        System.out.println("-".repeat(50));
        child.recommendedMethod();

        System.out.println("-".repeat(50));
        parent.recommendedStatic();
        System.out.println("-".repeat(50));
        childReferredToAsBase.recommendedStatic();
        System.out.println("-".repeat(50));
        child.recommendedStatic();


        System.out.println("-".repeat(50));
        BaseClass.recommendedStatic();
        ChildClass.recommendedStatic();

        System.out.println("-".repeat(50));
        StringBuilder zArgument = new StringBuilder("Only saying this section");
        String xArgument = "This is all I've got to say Section ";
        doXYZ(xArgument, 16, zArgument);
        System.out.println("After Method, xArgument: " + xArgument);
        System.out.println("After Method, zArgument: " + zArgument);



        System.out.println("-".repeat(50));
        StringBuilder tracker = new StringBuilder("Step 1 is abc");
        Logger.logToConsole(tracker);
        tracker.append(", Step 2 is xyz.");
        Logger.logToConsole(tracker);
        System.out.println("After logging, tracker = " + tracker); //it clears StringBuilder after everything is printed out
        /*
        03/06/25 11:11:08 : Step 1 is abc
        03/06/25 11:11:08 : , Step 2 is xyz.
        After logging, tracker =
         */


    }

    private static void doXYZ(String x, int y, final StringBuilder z) {

        final String c = x + y;
        System.out.println("c = " + c);
        x = c;
        z.append(y);
   //   z = new StringBuilder("This is a new reference");
    }
}
