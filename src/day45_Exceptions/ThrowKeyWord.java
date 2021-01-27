package day45_Exceptions;

import java.util.Scanner;

public class ThrowKeyWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        if(age<0||age>150){
          throw new RuntimeException("Invalid age Number entered "+age);
        }

        if(age>=21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not eligible to buy alcohol");
        }
        scan.close();





    }
}
