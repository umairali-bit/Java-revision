package cosnumer.specific;

import dev.lpa.generic.BaseClass;

public class ChildClass extends BaseClass {

    @Override
    protected void optionalMethod() {

        System.out.println("[Child:optionalMethod] EXTRA Stuff here");
        super.optionalMethod();

    }

    @Override
    public void recommendedMethod() {

        System.out.println("[Child:optionalMethod]: I will do things my way");
        optionalMethod();
    }
}

