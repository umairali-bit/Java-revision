package cosnumer.specific;

import dev.lpa.generic.BaseClass;

public class ChildClass extends BaseClass {

    @Override
    protected void optionalMethod() {

        System.out.println("[Child:optionalMethod] EXTRA Stuff here");
        super.optionalMethod();

    }

}

