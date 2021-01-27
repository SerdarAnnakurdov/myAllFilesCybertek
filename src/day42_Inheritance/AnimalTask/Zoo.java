package day42_Inheritance.AnimalTask;

public class Zoo { // zoo has a tiger
    public static void main(String[] args) {


        Tiger tiger = new Tiger("Sher Khan","Bengal Tiger",'M',5,"Orange","Large");

        System.out.println(tiger);
        tiger.roar();
        tiger.eat("Chicken");
        tiger.sleep();

        System.out.println("=============================================== ");

        Cat cat = new Cat("Kitty","British fold",'F',1,"White","Small");
        System.out.println(cat);
        cat.meow();
        cat.drink("Milk");
        cat.eat("Tuna");

        System.out.println("==================================================");



        Dog dog = new Dog("Nina","American bull dog",'F',2,"White and brown","Big");

        dog.eat("Chicken");
        dog.drink("water");
        dog.sleep();
        dog.bark();






    }
}
