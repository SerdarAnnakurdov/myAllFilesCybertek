package day50_Polymorphism;

import day47_Abstraction.EmployeeTask.Developer;
import day47_Abstraction.EmployeeTask.Employee;
import day47_Abstraction.EmployeeTask.Tester;
import day47_Abstraction.EmployeeTask.UberDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleInc {
    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("Mini", 23, 'F', "SDET", "D123", 76_000),
                new Developer("Mikki", 25, 'F', "SDET", "D123", 76_000),
                new UberDriver("Ker", 56, 'M', "driver", "D123", 100_000),
                new Tester("Mini", 23, 'F', "SDET", "D123", 76_000),
                new Developer("Mikki", 25, 'F', "SDET", "D123", 76_000),
                new UberDriver("Ker", 56, 'M', "driver", "D123", 100_000),
                new Tester("Mini", 23, 'F', "SDET", "D123", 76_000),
                new Developer("Mikki", 25, 'F', "SDET", "D123", 76_000),
                new UberDriver("Ker", 56, 'M', "driver", "D123", 100_000),
                new Tester("Mini", 23, 'F', "SDET", "D123", 76_000),
                new Developer("Mikki", 25, 'F', "SDET", "D123", 76_000),
                new UberDriver("Ker", 56, 'M', "driver", "D123", 100_000),
                new Tester("Mini", 23, 'F', "SDET", "D123", 76_000),
                new Developer("Mikki", 25, 'F', "SDET", "D123", 76_000),
                new UberDriver("Ker", 56, 'M', "driver", "D123", 100_000),
                new Tester("Mini", 23, 'F', "SDET", "D123", 76_000),
                new Developer("Mikki", 25, 'F', "SDET", "D123", 76_000),
                new UberDriver("Ker", 56, 'M', "driver", "D123", 100_000),
                new Tester("Mini", 23, 'F', "SDET", "D123", 76_000),
                new Developer("Mikki", 25, 'F', "SDET", "D123", 76_000),
                new UberDriver("Ker", 56, 'M', "driver", "D123", 100_000),
                new Tester("Mini", 23, 'F', "SDET", "D123", 76_000),
                new Developer("Mikki", 25, 'F', "SDET", "D123", 76_000),
                new UberDriver("Ker", 56, 'M', "driver", "D123", 100_000),
                new Tester("Mini", 23, 'F', "SDET", "D123", 76_000),
                new Developer("Mikki", 25, 'F', "SDET", "D123", 76_000),
                new UberDriver("Ker", 56, 'M', "driver", "D123", 100_000),
                new Tester("Mini", 23, 'F', "SDET", "D123", 76_000),
                new Developer("Mikki", 25, 'F', "SDET", "D123", 76_000),
                new UberDriver("Ker", 56, 'M', "driver", "D123", 100_000),
                new Tester("Mini", 23, 'F', "SDET", "D123", 76_000),
                new Developer("Mikki", 25, 'F', "SDET", "D123", 76_000),
                new UberDriver("Ker", 56, 'M', "driver", "D123", 100_000),
                new Tester("Mini", 23, 'F', "SDET", "D123", 76_000),
                new Developer("Mikki", 25, 'F', "SDET", "D123", 76_000),
                new UberDriver("Ker", 56, 'M', "driver", "D123", 100_000),

        };


        int countTesters = 0;
        int countDevelopers = 0;


        for(Employee eachEmp: employees){
            if(eachEmp instanceof Tester){
                countTesters++;
            }
            if(eachEmp instanceof Developer){
                countDevelopers++;
            }
        }


        System.out.println("countTesters = " + countTesters);
        System.out.println("countDevelopers = " + countDevelopers);

        System.out.println("=======================================================================");


        ArrayList<Employee> scrumMembers = new ArrayList<>();
        scrumMembers.addAll(Arrays.asList(employees));
        scrumMembers.removeIf(p->p instanceof UberDriver);


        System.out.println(scrumMembers.size());


        ArrayList<Employee> testers = new ArrayList<>();
        ArrayList<Employee> developers = new ArrayList<>();
        /*
        for(Employee eachEmployee: scrumMembers){
            if(eachEmployee instanceof Tester){
                testers.add(eachEmployee);
            }else{
                developers.add(eachEmployee);
            }
        }
        */

        scrumMembers.forEach(each-> {if(each instanceof Tester) testers.add(each);else developers.add(each);});







    }
}
