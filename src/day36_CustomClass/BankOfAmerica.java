package day36_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BankOfAmerica { // Bank of America HAS An Employee

    public static void main(String[] args) {
        String companyName = "Bank of America";
        Employee[] employees = {
                new Employee(),  //0
                new Employee(),
                new Employee(),
                new Employee(),
                new Employee()
        };

        employees[0].setInfo("Angelina Jolie", 'F', "Developer", companyName, 400_000, "0001", LocalDate.of(2018, 4, 15));
        employees[1].setInfo("Brad Pitt",'M',"Scrum Master",companyName,140_000,"0003",LocalDate.of(2016, 9,14));
        employees[2].setInfo("Obi-Wan Kenobi", 'M', "Ba", companyName, 164000, "3-CPO", LocalDate.of(2010, 2, 14));
        employees[3].setInfo("Ercan Civi", 'M', "SDET", companyName, 164000.50, "ABC123", LocalDate.of(2000, 2, 14));
        employees[4].setInfo("John Snow",'M',"Ceo",companyName,240_000,"0004",LocalDate.of(2006, 2,18));


        for(Employee each : employees){
            each.getInfo();
        }

        System.out.println("============================================");

        ArrayList<Employee> SDEtsAndDev = new ArrayList<>(Arrays.asList(employees));

        SDEtsAndDev.removeIf(p->!(p.jobTitle.equalsIgnoreCase("SDET")||p.jobTitle.equalsIgnoreCase("Developer")));
        // removes the employee if jobtitle of employee is not sdet or developer

        for(Employee each :SDEtsAndDev ){
            System.out.println(each.name+" : "+ each.jobTitle+", $"+ each.salary);
        }


        System.out.println("===================================================");

       ArrayList<Employee> richPeople = new ArrayList<>();
       richPeople.addAll(Arrays.asList(employees));
       // for(Employee each :employees)    richPeople.add(each);


        richPeople.removeIf(p->p.salary < 200000  );// we want to remove salaries less than 200000

        System.out.println("==========================================================");

        String name = "";
        double maxSalary = employees[0].salary; // assume that first employee's salary is max

        for(Employee each:employees){
            // maxSalary = Math.max(maxSalary,each.salary);
            if(each.salary>maxSalary){  // if any employee has more salary
                maxSalary = each.salary;
                name = each.name;
            }
        }

        System.out.println(name+" "+maxSalary);










    }


}

/*
Engine{
}
Car{
    Engine
}
Car Has An Engine
 */
