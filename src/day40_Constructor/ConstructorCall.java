package day40_Constructor;

public class ConstructorCall {
    public ConstructorCall(){
        System.out.println("Default contsr");
    }

    public ConstructorCall(int a){
        this(); // calling default constructor
        System.out.println("Contructor with int arg");
    }

public void method4(){
    //ConstructorCall();    only contructor can call constructor !!!!!!!!!!!!!!!!!!!!!!!!
}

    public static void method1(){
        //ConstructorCall();
        System.out.println("Method 1");
    }

    public ConstructorCall(String str){
        this(10); // it has to be over statement no belong

        System.out.println("Constructor with String");
        // this(10); // it has to be over statement no belong    this ir rule ......

    }

    public static void method2(){
        System.out.println("Method 2");
        method1();
    }

    public static void method3(){
        method1();
        method2();
        System.out.println("Method 3");

    }

    public static void main(String[] args) {
       ConstructorCall obj1 = new ConstructorCall("A");


    }

}
/*
2/11/2020
Topic: Constructor
Package name: day40_Constructor
Class & Object:
        instances:
            instance variables
            instance methods
            this.
            toString
            Constructor
        statics:
            static variable
            static methods
            static block
rugular methods:

        Access Modidifier  specifier  returnType methodName(Parameter){
        }
Constructor: very special

            every class MUST have. if we dont create, compiler creates one (with no argument)
            only gets executed when we create the object
    declear:
        Access Modidifier   ClassName(parameter){
        }
    Object:
            new ExistingConstructor()
        A:
            new A();
task:
    Circle
        variables:
                radius, PI, diameter, area, perimeter
        add a constructor to initialize the instances
    Item:
        variables:
            name, unitPrice, quantity
        add constructor to initialize all fields of Item
        methods:
            calcCost(): returns the total cost
                        hint:  total cost is = quantity * unitPrice
            toString()

    Employee
        variables:
                name, age, gender, SSN, salary
        add constructor to initialize all fields
        Methods:
            toString()
    Dog:
        variables:
                breed, size, gender, color, numberOfLegs, numberOfEyes, numberOfWings
        add constructor to initialize all fields
        methods:
            toString()
    Cat:
        variables:
                breed, size, gender, color, numberOfLegs, numberOfEyes, numberOfWings
        add constructor to initialize all fields
        methods:
            toString()
    Phone:
        variables:
            brand, model, price, size, hasScreen,
        add a constructor to initialize the fields
        methods:
            toString
Constructor call
come back: 2:15pm

 */