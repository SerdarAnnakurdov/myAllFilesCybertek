package day47_Abstraction.ShapeTasks;

import javax.print.attribute.standard.SheetCollate;

public abstract class Shape {
    public String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area(); // what is matter how is done doesnt matter
    public abstract double perimeter();


}


