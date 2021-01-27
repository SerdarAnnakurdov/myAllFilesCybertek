package Office_Hours.Practice_01_27_2021;

import day38_Statics.Iphone;
import day49_Abstraction.ShapeTask.Circle;
import day49_Abstraction.ShapeTask.Cube;
import day49_Abstraction.ShapeTask.Cylinder;
import day49_Abstraction.ShapeTask.Volume;
import day50_Polymorphism.PhoneTask.*;

public class UpDownCasting {
    public static void main(String[] args) {
        //reference type casting same meaning up and down casting .... there is supposed to be rel..

        Phone phone = new IPhone("gal5", "sm", "whit", 12);
        //((IPhone)phone).faceTime(1414);
        ((IPhone) phone).faceTime(222);


        IPhone iPhone = (IPhone) phone;
        iPhone.faceTime(1212);
        iPhone.faceTime(1313);


        // Phone phone1 = (Samsung) phone;

        System.out.println("========================================================");


        Phone phone2 = new Nokia("n5", "a", "white", 12);
        ((Nokia) phone2).shanikDowya();
        //((IPhone)phone2).faceTime(121); when  there is no relation you can not call methods from the obj's

        System.out.println(phone2);
        System.out.println("==========================================================");

        Phone phone1 = new Huwawei("n5", "a", "white", 12);
        ((Huwawei) phone1).SpyAction();
        // ((IPhone)phone1).faceTime(121); there is no rel between Huwai and Iphone thats why comp

        System.out.println("==============================================================");

        Phone phone3 = new Samsung("galaxy", "lagre", "white", 121);
        //((Huwawei) phone3).SpyAction();
        //((Nokia) phone3).shanikDowya();
        //((IPhone) phone3).faceTime(11111);"n5", "a", "white", 12
        ((Samsung) phone3).freeze();

        System.out.println("===============================================================");

        //Volume s1 = new Circle(3);
        Volume v = new Cube(3); // up casting there is a rel bettwen volume and cube
        double area = ((Cube) v).area();
        System.out.println(" Area is: "+area+" ))");


    }
}
