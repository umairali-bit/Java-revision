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

    }
}
