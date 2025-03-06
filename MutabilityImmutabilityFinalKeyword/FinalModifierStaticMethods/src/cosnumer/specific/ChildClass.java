package cosnumer.specific;

import dev.lpa.generic.BaseClass;

public class ChildClass extends BaseClass {

    @Override
    protected void optionalMethod() {

        System.out.println("[Child:optionalMethod] EXTRA Stuff here");
        super.optionalMethod();

    }

//    @Override
//    public void recommendedMethod() {
//
//        System.out.println("[Child:optionalMethod]: I will do things my way");
//        optionalMethod();
//    }

    private void mandatoryMethod() {
        System.out.println("[Child:optionalMethod]: My own important stuff");
    }

    public static void recommendedStatic() {

        System.out.println("[ChildClass:recommendedStatic] BEST way to do it");
        optionalStatic();
        //mandatoryStatic();

    }
}

