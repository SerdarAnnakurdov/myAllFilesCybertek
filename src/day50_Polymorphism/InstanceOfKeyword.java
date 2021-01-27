package day50_Polymorphism;

import day48_Abstraction.AnimalTask.Animal;
import day48_Abstraction.AnimalTask.Dog;
import day48_Abstraction.AnimalTask.Dolphin;
import day48_Abstraction.AnimalTask.Eagle;
import day49_Abstraction.A;

public class InstanceOfKeyword {
    public static void main(String[] args) {

        Animal animal = new Dog("xx", "yy", "t", 'f', 12);


        boolean isDog = animal instanceof Dog;
        boolean isDolphine = animal instanceof Dolphin;
        boolean isEagle = animal instanceof Eagle;
        boolean isAnimal = animal instanceof Animal;

        System.out.println("isDog = " + isDog);
        System.out.println("isDolphine = " + isDolphine);
        System.out.println("isEagle = " + isEagle);
        System.out.println("isAnimal = " + isAnimal);


    }
}
