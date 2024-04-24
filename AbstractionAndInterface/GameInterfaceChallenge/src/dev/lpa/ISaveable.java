package dev.lpa;

import java.util.List;

/*
ISaveable (interface)

    -  It has two methods:

        -  write(), takes no arguments and returns a List containing objects of type String.

        -  read(), takes a List of type String and doesn't return anything.
 */

public interface ISaveable {

    List <String> write();
    void read (List <String> savedValues);


}
