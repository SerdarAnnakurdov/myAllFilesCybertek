package day38_Statics;

public class Iphone {

    public String model, color, storage;
    public double price;

    public static String brand = "Apple", OS = "iOS", madeIn = "China";

    public void call(long phoneNumber){
        System.out.println("IPhone "+model+" is calling "+phoneNumber);

    }
    public static void getIphoneInfo(){
        System.out.println("Brand is :"+brand+", Oerating System is: "+OS+", Made in: "+madeIn);

    }

    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Color: "+color+", Price: "+price+", Operating System: "+OS;
    }


}
