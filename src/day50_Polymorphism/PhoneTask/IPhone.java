package day50_Polymorphism.PhoneTask;

public final class IPhone extends Phone implements AppleApps {

    public IPhone(String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
        if(price>1500){
            throw new RuntimeException("Invalid Price, IPhone can not be more than $1500");
        }



    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading Apps from: "+AppStoreName);
    }

    @Override
    public void text() {
        System.out.println(model+" is texting");
    }

    @Override
    public void call() {
        System.out.println(model+" is calling");
    }
    public void faceTime(int number){
        System.out.println("Face time calling to: "+number);
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", OS=" + OS +
                '}';
    }
}
// IPhone Phone AppleApps