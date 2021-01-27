package day50_Polymorphism;

import day38_Statics.Iphone;
import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Cat;
import day43_Inheritance.CarTask.BMW;
import day43_Inheritance.CarTask.Car;
import day43_Inheritance.CarTask.Toyota;
import day48_Abstraction.AnimalTask.Dog;
import day49_Abstraction.RemoteDriverTask.*;
import day49_Abstraction.ShapeTask.Circle;
import day49_Abstraction.ShapeTask.Cube;
import day49_Abstraction.ShapeTask.Cylinder;
import day49_Abstraction.ShapeTask.Shape;
import day50_Polymorphism.PhoneTask.IPhone;
import day50_Polymorphism.PhoneTask.Phone;
import day50_Polymorphism.PhoneTask.Samsung;

public class DownCasting {
    public static void main(String[] args) {

        Shape shape = new Cylinder(3, 5);
        Cylinder cylinder = (Cylinder) shape;

        double volume = ((Cylinder) shape).volume();
        System.out.println(volume);

        System.out.println("=========================================");

        Car car = new Toyota("camry", "white", 2020, 45000, 23000);
        // ((BMW)car).race();

        System.out.println("==========================================");


        Phone phone = new Samsung("s20", "large", "white", 1000);

        // phone.faceTime(); becouse of polymorphism reference type doesnt let you do it.
        //((IPhone)phone).faceTime(12121);

        System.out.println("=======================================================");

        WebDriver driver = new ChromeDriver();
        ((TakeScreenShot)driver).TakeScreenShot("Pictures");
        ((JavaScriptExecuter)driver).Executer("script");

        System.out.println("=====================================================");

        Shape shape1 = new Circle(3);
        //((Cube)shape1).volume();

        System.out.println("========================================================");
        ((TakeScreenShot) driver).TakeScreenShot("pics");
        ((JavaScriptExecuter) driver).Executer("aa");

        System.out.println("=================================================");
        
        boolean isChromeDriver = driver instanceof ChromeDriver;
        System.out.println("isChromeDriver = " + isChromeDriver);

        //значение слова сравнение //// 





    }
}
