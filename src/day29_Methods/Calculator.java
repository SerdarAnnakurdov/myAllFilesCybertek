package day29_Methods;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //calculator(scan.nextDouble(), scan.next().charAt(0), scan.nextDouble());


        calculator(10,'-',5);


    }


    public static void calculator(double n1, char operator, double n2) {

        boolean isValid = operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%';
        if(isValid){
            /*switch (operator){
                case '+':
                    System.out.println("Addition selected: "+(n1+n2));break;
                case '-':
                    System.out.println("Subtraction selected: "+(n1-n2));break;
                case '*':
                    System.out.println("Multiplication selected: "+(n1*n2));break;
                case '/':
                    System.out.println("Division selected: "+(n1/n2));break;
                default:
                    System.out.println("Reminder selected: "+(n1%n2));
            }
*/

            System.out.println((operator=='+')?"Addition:"+(n1+n2): (operator== '-')?"Subtraction: "+(n1-n2):(operator=='*')?"Multipication "+(n1*n2):(operator=='/')?"Division"+(n1/n2):"Remainder"+(n1%n2));


        }else{
            System.err.println("Invalid operator");
        }

    }

}
/*
write a program that can calculate numbers
 */
