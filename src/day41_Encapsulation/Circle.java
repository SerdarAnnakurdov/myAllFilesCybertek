package day41_Encapsulation;

public class Circle {
    private double radius, diameter, area, perimeter;
    private final static double PI;

    static {
        PI = Math.PI;

    }

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        diameter = radius * 2;
        area = calculateArea();
        perimeter = calculatePerimeter();

    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public static double getPI() {
        return PI;
    }

    private double calculateArea() {
        return radius * radius * PI;
    }

    private double calculatePerimeter() {
        return diameter * PI;
    }
}
