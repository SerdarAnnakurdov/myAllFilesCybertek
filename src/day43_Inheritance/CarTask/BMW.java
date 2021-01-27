package day43_Inheritance.CarTask;

public class BMW extends Car{
 /*
variables : brand,model.color,madeIn,year,price;
methods : setInfo , drive , park;
 */

    public BMW( String model, String color,  int year, int miles, double price){
        setInfo("BMW", model, color, "GERMANY", year, miles, price);
    }

    public static boolean isExpensive,isLuxury, breaksAlot;
    static {
        isExpensive=true;
        isLuxury=true;
        breaksAlot = true;
    }
    public void race(){
        System.out.println(brand+" "+model+" is racing");
    }


}
