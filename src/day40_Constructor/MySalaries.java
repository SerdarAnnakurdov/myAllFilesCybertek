package day40_Constructor;

import sun.jvm.hotspot.SALauncherLoader;

import java.util.ArrayList;
import java.util.Arrays;

public class MySalaries {
    public static void main(String[] args) {


        SalaryCalculator salary1 = new SalaryCalculator(40, 55, 9, 22);

        SalaryCalculator salary2 = new SalaryCalculator(40, 55, 0, 23);

        SalaryCalculator salary3 = new SalaryCalculator(45, 35, 8, 21);

        SalaryCalculator salary4 = new SalaryCalculator(45, 65, 8, 24);

        SalaryCalculator salary5 = new SalaryCalculator(50, 70, 9, 22);


        /// print the maximum salary of this with adding them in to arrey...


        ArrayList<SalaryCalculator> salaries = new ArrayList<>();
        /*
        double maxS = maxSalary.get(0).salary;

        for (SalaryCalculator eachSalary : maxSalary) {
            if (eachSalary.salaryAfterTax > maxS) {
                maxS = eachSalary.salaryAfterTax;
            }
        }
        System.out.println("Maximum Salary: "+maxS);




        double minS = maxSalary.get(0).salary;

        for (SalaryCalculator eachSalary : maxSalary) {
            if (eachSalary.salaryAfterTax < minS) {
                minS = eachSalary.salaryAfterTax;
            }
        }
        System.out.println("Minimum salary: "+minS);

*/
        salaries.addAll(Arrays.asList(salary1, salary2, salary3, salary4, salary5));

        double maxSalaryAfterTax = salaries.get(0).salaryAfterTax;
        double minSalaryAfterTax = salaries.get(0).salaryAfterTax;

        double maxTotalTax = salaries.get(0).totalTax;
        double minTotalTax= salaries.get(0).totalTax;



        for (SalaryCalculator eachSalary : salaries) {
            maxSalaryAfterTax = Math.max(eachSalary.salaryAfterTax, maxSalaryAfterTax);
            minSalaryAfterTax = Math.min(eachSalary.salaryAfterTax, minSalaryAfterTax);

            maxTotalTax = Math.max(eachSalary.totalTax,maxTotalTax);
            minTotalTax = Math.min(eachSalary.totalTax,minTotalTax);



            System.out.println(eachSalary.salaryAfterTax);

        }

        System.out.println("Max Salary: " + maxSalaryAfterTax);
        System.out.println("Min Salary: "+minSalaryAfterTax);
        System.out.println("=======TOTALS=======");
        System.out.println("Max Total Tax: "+maxTotalTax);
        System.out.println("Min Total Tax: "+minTotalTax);


        System.out.println("=====================================================================");






























    }
}
