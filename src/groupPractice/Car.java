package groupPractice;

public class Car {
    public String brand,model;
    public int mileage;



    public static String typeOfCar;


    public void setInfo(String brand, String model, int mileage) {
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
