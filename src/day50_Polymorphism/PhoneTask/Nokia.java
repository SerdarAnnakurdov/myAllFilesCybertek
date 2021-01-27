package day50_Polymorphism.PhoneTask;

public class Nokia extends Phone{
    public Nokia( String model, String size, String color, double price) {
        super("Nokia", model, size, color, price);
    }

    @Override
    public void text() {

    }

    @Override
    public void call() {

    }

    public void shanikDowya(){
        System.out.println("Shanik dowya method");
    }


    @Override
    public String toString() {
        return "Nokia{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
