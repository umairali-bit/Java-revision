package dev.lpa.sealed;

public sealed abstract class SpecialAbstractClass permits FinalKid, NonSealedKid,
        SealedKid, SpecialAbstractClass.Kid {

    //nested class
    final class Kid extends SpecialAbstractClass {



    }
}
