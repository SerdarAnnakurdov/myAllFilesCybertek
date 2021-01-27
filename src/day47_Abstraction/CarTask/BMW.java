package day47_Abstraction.CarTask;

public class BMW extends Car {
    public BMW( String model, String color, int year, double price) {
        super("BMW", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Insert the key and twist it");
    }
}
