package dev.lpa;

public enum Topping {

    MUSTARD,
    PICKLES,
    TURKEY,
    CHEDDAR,
    TOMATO;


    public double getPrice() {
        return switch(this){
            case TURKEY -> 1.5;
            case CHEDDAR -> 1.0;
            default -> 0.0;
        };
    }


}
