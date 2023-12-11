package dev.lpa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Animal animal = new Animal ("animal", "big", 100);//illegal

        //Instead
        Dog dog = new Dog("Wolf","big",100);
        dog.makeNoise();
        doAnimalStuff(dog);

        //creating an arrayList of animals
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepherd", "big", 150));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Fish("Barracuda", "big", 74));
        animals.add(new Dog("Pug","small", 20));
        animals.add(new Horse("Clydesdale", "large",1000));


        for(Animal animal : animals){

            doAnimalStuff(animal);
            //instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
            if(animal instanceof Mammal currentMammal){
                currentMammal.shedHair();

            }

        }






    }

    private static void doAnimalStuff(Animal animal) {

        animal.makeNoise();
        animal.move("slow");
    }


}
