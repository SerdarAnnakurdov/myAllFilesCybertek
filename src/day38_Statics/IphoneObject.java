package day38_Statics;

public class IphoneObject {
    public static void main(String[] args) {


        Iphone iphone1 = new Iphone();

        Iphone iphone2 = new Iphone();

        Iphone iphone3 = new Iphone();

        Iphone iphone4 = new Iphone();


        //iphone1.OS = "Android";


        System.out.println(iphone1.OS);
        System.out.println(iphone2.OS);
        System.out.println(iphone3.OS);
        System.out.println(iphone4.OS);

        Iphone.getIphoneInfo();












    }
}
