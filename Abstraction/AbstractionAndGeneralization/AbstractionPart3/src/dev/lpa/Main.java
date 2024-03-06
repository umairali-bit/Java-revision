package dev.lpa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // creating an animal variable

        //Animal animal = new Animal("animal", "big", 100); invalid, cannot create an instance of an abstract class

        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepherd", "big", 150));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Fish("Barracuda", "big", 75));
        animals.add(new Dog("Pug", "small", 20));

        animals.add(new Horse("Clydesdale", "large", 1000));

        for(Animal animal : animals){
            doAnimalStuff(animal);
            if(animal instanceof Mammals currentMammal) {
                currentMammal.shedHair();
            }
        }


        Horse horse = new Horse("Clydesdale", "Large", 1000);



    }

    /*
    we can call dog anywhere using abstraction
     */

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }
}

