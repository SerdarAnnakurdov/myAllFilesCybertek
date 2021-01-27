package day47_Abstraction.CarTask;

public abstract class Car {
    public String brand,model,color;
    public int year;
    public double price;

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }



    public abstract void start(); // worry about details later
    //private abstract void start(); private methods cant be overridden
    // abstract never can be private
    // public final abstract void start();  final methods cant be overriden cz final value..
    // public static abstract void start(); as static has only one copies of files it cant be changed

    // any return types acceptable for abstract methods ...

      // public abstract int start(int a);  with adding more abstract methods u hv to override them in sub classes too


    // abstract class VS regular class: both are class can have methods , variables , blocks

    //differences:  (class)--> can have an object !!!!!  (abstract)-->> can't have objects



    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
