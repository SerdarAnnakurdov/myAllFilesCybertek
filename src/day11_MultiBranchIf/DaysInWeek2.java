package day11_MultiBranchIf;

import java.util.ArrayList;
import java.util.List;

public class DaysInWeek2 {
    public static void main(String[] args) {

        int n1 = 5;
        String day1 = (n1 == 1) ? "Monday" : (n1 == 2) ? "Tuesday" : (n1 == 3) ? "Wednesday" : (n1 == 4) ? "Thursday" :
                (n1 == 5) ? "Friday" : (n1 == 6) ? "Saturday" : "Sunday";
        System.out.println("Today is : " + day1);


        int n = 7;
        String day = (n == 1) ? "1-nji gun" : (n == 2) ? "2-nji gun" : (n == 3) ? "3-nji gun" : (n == 4) ? "4-nji gun" :
                (n == 5) ? "5-nji gun" : (n == 6) ? "6-nji gun" : "Otdyhgun";

        System.out.println("Today is : " + day);
        System.out.println("===========================");


        // 3 sany mashyn 2
        int car1 = 2020; // 80
        // 93
        int gas = 0;

        if (car1 >= 2010 && car1 < 2020) {
            gas = 80;
        } else if (car1 >= 2015 && car1 > 2020) {
            gas = 92;
        } else if (car1 == 2020) {
            gas = 93;
        }
        System.out.println("Your gas type : " + gas);

        String gas1 = (car1 == 2010) ? "Your gas type is 80" : (car1 == 2015) ? "Your gas type 92" : "Gas type is 93";
        System.out.println(gas1);

        System.out.println("===========================================");

        int sum = 21;
        if(sum!=20){
            System.out.println("you win ");
        }else{
            System.out.println("you lose");
        }
        System.out.println("the prize");

        /*
        * Write java programming language with following logic
        * 1-if marks < 60 then print FAIL
        * 2- if marks >=60, but less then 90 then print PASS
        * 3- if marks >=90 then print "PASSED WITH DISTINCTION*/


        System.out.println("========================");

        int marks = 91;

        if(marks<60){
            System.out.println("FAIL");

        }else if(marks>= 60 && marks < 90){

            System.out.println("PASSSSS ");
        }else{
            System.out.println("PASSED WITH DISTINCTION");
        }
        System.out.println("===============================");

        String marks1 = (marks<60) ?" Fail " : (marks>= 60 && marks < 90)? "Pass" : "Passed with Distinction";
        System.out.println(marks1);

        int t = 11 ;
        int r = 2 ;


        if(t>r){
            System.out.println("T is max");
        }else{
            System.out.println("R is max");
        }


        System.out.println("==============================");

        int month = 13;

        boolean day28month = month == 2;
        boolean day30month = month == 4 || month == 6 || month == 9 || month == 11;
        boolean days31month =!day28month && ! day30month;

        int days = 0;
        if(day28month){
            days = 28;
        }else if(day30month){

        }else if(days31month){
            days = 31;
        }

        System.out.println(days+" in this month ");


        System.out.println("=============================");



















//        int n2 = 20;
//        if(n2>=21){
//            System.out.println("You can buy a cigaretter");
//        }





    }
}
