package day38_Statics;

import java.util.Arrays;

public class CircleObject {
    public static void main(String[] args) {

        Circle circle1 = new Circle();

        circle1.setInfo(5);

        System.out.println(circle1);

        // circle1.equals()


        Circle circle2 = new Circle();
        circle2.setInfo(51);

        System.out.println(circle2);


        System.out.println(circle1 == circle2);

        System.out.println(circle1.equals(circle2));


    }
}
