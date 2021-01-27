package day47_Abstraction.EmployeeTask;

import com.sun.xml.internal.bind.v2.model.core.ID;

public  abstract class Employee extends Person{
    public String jobTitle,ID;
    public double salary;


    public Employee(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }

     abstract void work();
    // public abstract void sleep()


    @Override
    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", age=" + age +
                ", Gender=" + Gender +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
