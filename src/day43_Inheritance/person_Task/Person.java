package day43_Inheritance.person_Task;

public class Person {
    public String name;
    public int age;
    public char gender;


    public void setInfo(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*

Warmup task
    Person
        name, age, gender
        setInfo, eat(), sleep()
    Employee extends Person:
        name, age, gender, hourlyRate, jobTitle, ID
        setInfo, eat(), sleep(), work()
    Tester extends Employee:
        name, age, gender, hourlyRate, jobTitle, ID
        Constructor
        eat(), sleep(), work(), testing(),...
    Developer extends Employee:
        name, age, gender, hourlyRate, jobTitle, ID
        Constructor
        eat(), sleep(), work(), code()...
Inheritance: to build IS A relationship between the classes. parent and child classes
             easiest and fastest way to get rich ==> extends
            child class (sub):  can inherit methods and variables from parent class (ONLY the visible variables and methods)
                    Constructor cannot be inherited
                    public: inheritable at every where
                    default: inheritable within same package
            Parent class (super): Cannot Inherit from sub class
next week:
    Overriding
    Constructors
     OOP Abstraction
     OOP PolymorphismRules
Collapse





 */