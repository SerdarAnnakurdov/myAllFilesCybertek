package day47_Abstraction.EmployeeTask;

public  abstract class Person {
    public String name;
    public char Gender;
    public int age;


    public Person(String name,int age,char gender) {
        this.name = name;
        Gender = gender;
        this.age = age;
    }



    public abstract void sleep();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Gender=" + Gender +
                ", age=" + age +
                '}';
    }
}
