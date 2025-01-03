package dev.lpa;

@FunctionalInterface
public interface Operation<T> {

    //1 abstract method (Functional Method) that takes two arguments
    T operate (T value1, T value2);
}
