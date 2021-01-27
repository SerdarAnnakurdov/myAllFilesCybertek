package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score: ");

        int score =  scan.nextInt();
        scan.close();

        String grade = "";

        if(score >= 0 && score <= 100){

            if(score >= 90 ){ // becomes false when score < 90
                grade = "Excellent";
            }else if(score>= 80 ){ // becomes false when score < 80
                grade  = "Great";
            }else if(score >= 70){ // becomes false when score < 70
                grade = "Good";
            }else if(score >= 60){ // becomes false when score < 60
                grade = "Passed";
            }else{
                grade = "Fail";
            }

        }else{
            grade = "Invalid";
        }
        System.out.println("Your grade is : "+grade);


        System.out.println("================================="); // next at the bottom ternary kind of top

        //grade = (score>=90)?"Excellent" :(score>=80)? "Great":(score>=70)?"Good":(score>=60)?"Pass":"Fail";





    }
}
/*
a : 90-100
b : 80-89
c: 70-79
d: 60-69
f: 0-59

 */
