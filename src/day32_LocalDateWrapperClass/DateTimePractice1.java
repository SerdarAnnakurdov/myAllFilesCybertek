package day32_LocalDateWrapperClass;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class DateTimePractice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your birth year, month and day"); // person : A
        LocalDate dofB1 = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());

        System.out.println("Enter second person birth year, month and  day"); // person : B
        LocalDate dofB2 = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());

        if (dofB1.isBefore(dofB2)) {
            System.out.println("First person is older");
        } else if (dofB2.isBefore(dofB1)) {
            System.out.println("Second person is older");
        } else {
            System.out.println("Same age");
        }


        // current age:
        int age1  = LocalDate.now().plusYears(30).getYear() - dofB1.getYear();
        int age2 = LocalDate.now().plusYears(30).getYear() - dofB2.getYear();

        // after 30 years:
        //int after1 = age1+30;
        //int after2 = age2+30;

        System.out.println("after1 = " + age1);
        System.out.println("after2 = " + age2);

        LocalDate DofB3 = LocalDate.of(1980,12,5);
        System.out.println(calculateAge(DofB3,20)+" years old");






    }

    public static int calculateAge(LocalDate DofB, int year ){
        return LocalDate.now().plusYears(year).getYear()-DofB.getYear();
    }




}
