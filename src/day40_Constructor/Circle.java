package day40_Constructor;

import Office_Hours.Practice_12_09_2020.Pizza;

public class Circle {
    public static double PI;

    static {
        PI = 3.14;
    }

    public double r, d, area, perimeter;


    public Circle(double radius) {
        r = radius;
        d = r * 2;
        area = r * r * PI;
        perimeter = d * PI;
    }


}

class CircleOBjects {
    public static void main(String[] args) {


        Circle circle1 = new Circle(5);

        System.out.println(circle1.area);
        System.out.println(circle1.perimeter);


        Circle circle2 = new Circle(10);


    }
}


/*
Circle
        Variables : raidus , PI , Diameter,area,perimeter



        add a constructor to initialize the instances
 */