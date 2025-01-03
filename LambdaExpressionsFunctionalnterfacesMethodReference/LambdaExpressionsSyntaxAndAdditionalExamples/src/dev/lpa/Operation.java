package dev.lpa;

@FunctionalInterface
public interface Operation<T> {

    //1 abstract method that takes two arguments
    T operate (T value1, T value2);
}
