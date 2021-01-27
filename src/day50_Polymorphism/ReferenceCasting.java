package day50_Polymorphism;

import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Dog;
import day47_Abstraction.ShapeTasks.Circle;
import day47_Abstraction.ShapeTasks.Shape;

public class ReferenceCasting {
    public static void main(String[] args) {
        // implicit casting is : done auto  smaller to larget
        int a = 10;
        double b = a;    // <<<---- this is implicit casting which done by automatically

        // explicit casting : larger to smaller
        double d = 10.5;
        int c = (int)d;   // <<---- this is kinda which was casted by manual withing (int)
                            // Explicit one MUST be DONE Manually !!!!!!!!!!!!!!!!!!!!

        System.out.println("============================================================");

        Circle circle = new Circle(3);
        Shape shape = circle;


        //Down casting: larger reference type to the smaller ...
        Animal animal = new Dog("Lucy","bb",'M',12,"white","sm");
        Dog dog = (Dog)animal;
        ((Dog) animal).bark();












    }
}
