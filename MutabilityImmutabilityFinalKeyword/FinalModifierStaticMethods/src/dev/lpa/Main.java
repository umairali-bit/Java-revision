package dev.lpa;

import cosnumer.specific.ChildClass;
import dev.lpa.generic.BaseClass;

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
        String xArgument = "This is all I've got to say Section ";
        doXYZ(xArgument, 16);


    }

    private static void doXYZ(String x, int y) {

        final String c = x + y;
        System.out.println("c = " + c);

    }
}
