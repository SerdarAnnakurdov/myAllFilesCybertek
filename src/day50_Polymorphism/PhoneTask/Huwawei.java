package day50_Polymorphism.PhoneTask;

public class Huwawei extends Phone{

    public Huwawei( String model, String size, String color, double price) {
        super("Huawai", model, size, color, price);
    }

    @Override
    public void text() {

    }

    @Override
    public void call() {

    }

    @Override
    public String toString() {
        return "Huwawei{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
