package day28_MultiDimensionalArray;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        String[] employeeNames = {"Serdar", "Feride", "Maya", "Merdan", "Maya"};
        //       index numbers :    0       1       2         3       4
        int[] employeeSalary = {1000000, 110000, 105000, 120000, 125000};
        //       index numbers :   0     1       2     3       4

        int max = employeeSalary[0];
        String nameOfMax = employeeNames[0];

        int min = employeeSalary[0];
        String nameOfMin = employeeNames[0];


        for (int i = 0; i < employeeNames.length; i++) {
            System.out.println(employeeNames[i] + " : $" + employeeSalary[i]);

            if (employeeSalary[i] > max) {
                max = employeeSalary[i];
                nameOfMax = employeeNames[i];
            }
            if (employeeSalary[i] < min) {
                min = employeeSalary[i];
                nameOfMin = employeeNames[i];
            }


            System.out.println(nameOfMax + " has the maximum salary: " + max);
            System.out.println(nameOfMin+ " has the minimum salary: "+min);


        }








        /*
        John : $100000
        .....
        who has the highest salary
        who has the minimum salary
         */


    }
}
