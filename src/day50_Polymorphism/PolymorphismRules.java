package day50_Polymorphism;

import day47_Abstraction.CarTask.BMW;
import day47_Abstraction.CarTask.Car;
import day47_Abstraction.CarTask.Tesla;
import day48_Abstraction.AnimalTask.Animal;
import day48_Abstraction.AnimalTask.Dog;
import day49_Abstraction.ShapeTask.Circle;
import day49_Abstraction.ShapeTask.Cube;
import day49_Abstraction.ShapeTask.Shape;

public class PolymorphismRules {
    public static void main(String[] args) {


        Dog dog = new Dog("a", "husky", "large", 'M', 12);
        Dog dog1 = new Dog("aaa", "a", "a", 'g', 1);

        dog.play();
        dog.play();


        Cube cube = new Cube(5);
        System.out.println(cube.area());
        System.out.println(cube.perimeter());
        System.out.println(cube.volume());

        Shape shape = new Cube(5);

        System.out.println(shape.area());
        System.out.println(shape.perimeter());
        //System.out.println(shape.volume);

        System.out.println("========================================");


        Car car = new Tesla("model 3", "white", 2019, 45000);
        car.start();

        Car car1 = new BMW("x5", "red", 2018, 55000);
        car1.start();

        System.out.println("===============================================");


        Animal animal = new Dog("Lucy", "husky", "small", 'M', 12);
        // animal.bark();


    }
}
