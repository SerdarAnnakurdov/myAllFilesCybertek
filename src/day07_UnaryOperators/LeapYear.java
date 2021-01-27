package day07_UnaryOperators;

public class LeapYear {
    public static void main(String[] args) {
 int year = 2020;
 boolean isLeapYear = year % 4 < 1; // checks if 2020 is evenly devisible by 4
        System.out.println(year+" is leap year :"+isLeapYear);
        System.out.println("==================================");

        int year1 = 2019;
        boolean isLeapYear1 = year1 % 4 < 1;
        System.out.println(year1+" is leap year :"+isLeapYear1);









    }
}
/*
  1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
                year = 2020
            output:
                2020 is leap year: true
                year = 2021
            output:
                2021 is leap year: false
                >, <

 */