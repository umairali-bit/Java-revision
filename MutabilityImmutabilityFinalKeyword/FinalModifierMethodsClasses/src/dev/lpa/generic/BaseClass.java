package dev.lpa.generic;

public class BaseClass {

    /*
    This class should not be customizable
    This class should have three methods
     */

    //to control the work flow on the class we have a public method
    public final void recommendedMethod() {
        System.out.println("[BaseClass.recommendedMethod]: Best way to do it");
        optionalMethod();
        mandatoryMethod();

    }

    /*
    optional() will be protected, meaning only classes that can call it are subclasses or classes in the same
    package
     */
    protected void optionalMethod() {
        System.out.println("[BaseClass.recommendedMethod]: Customize Optional Method");
    }


    /*
    mandatory() will be private because it shouldnt be altered or override by subclasses
     */

    private void mandatoryMethod() {
        System.out.println("[BaseClass.recommendedMethod]: NON-NEGOTIABLE");

    }



}
