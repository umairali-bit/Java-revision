package dev.lpa.sealed;

public sealed abstract class SpecialAbstractClass permits SpecialAbstractClass.Kid {

    //nested class
    final class Kid extends SpecialAbstractClass {



    }
}
