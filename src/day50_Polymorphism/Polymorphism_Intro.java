package day50_Polymorphism;

import day38_Statics.Iphone;
import day49_Abstraction.RemoteDriverTask.ChromeDriver;
import day49_Abstraction.RemoteDriverTask.CybertekDriver;
import day49_Abstraction.RemoteDriverTask.FireFoxDriver;
import day49_Abstraction.RemoteDriverTask.WebDriver;
import day49_Abstraction.ShapeTask.Circle;
import day49_Abstraction.ShapeTask.Shape;
import day49_Abstraction.ShapeTask.Square;
import day50_Polymorphism.PhoneTask.IPhone;
import day50_Polymorphism.PhoneTask.Phone;
import day50_Polymorphism.PhoneTask.Samsung;

import java.util.ArrayList;

public class Polymorphism_Intro {
    public static void main(String[] args) {

        IPhone iPhone1 = new IPhone("Iphone 12", "Small", "SpaceGray", 1200);
        Samsung samsung1 = new Samsung("Galaxy S20", "Large", "Black", 1100);

        Phone iPhone = new Samsung("galax", "saa", "asa", 112);

        Phone iphone2= new IPhone("Iphone 12", "Small", "SpaceGray", 1200);

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Samsung("wadawd","awdawda","awdawdwa",1));
        phones.add(new IPhone("adawda","adawda","awdaw",1));



        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(2));
        shapes.add(new Circle(2));

        Shape shape;
        shape = new Circle(3);
        System.out.println(shape.area());


        System.out.println("========================================= ");

        String browserName = "firefox";


        WebDriver driver;
         switch (browserName){
             case "firefox":
                 driver=new FireFoxDriver();
             case "chrome":
                 driver= new ChromeDriver();
             case "cybertek":
                 driver=new CybertekDriver();
             default: throw new RuntimeException("Invalid br name");

         }






    }
}
