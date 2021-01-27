package day16_Scanner;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Scanner_Addition {
    public static void main(String[] args) {   // make the scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your value: ");
        double num1 = input.nextDouble();       // accepting the first number

        System.out.println("Enter your 2value: ");
        double num2 = input.nextDouble();       // accepting the second number

        System.out.println("Enter for the operator");
        String operator = input.next();         // accepting operation

        input.close(); // closing the scanner becouse we have all the inputs ..

        double result = 0;

        boolean isValid= true;

        switch (operator){
            case "x":                   // you can add the character your own meaning if you want to ..
            case "+": result = num1+num2;break;
            case "-": result = num1-num2;break;
            case "*": result = num1*num2;break;
            case "bolmek":   // my own understanding character - bolmek which is devision ...
            case "/": result = num1/num2;break;
            case "%": result = num1%num2;break;
            default:
                System.out.println(operator+" is an Invalid operator");
                isValid=false;

        }

        if(isValid){
            System.out.println(num1+" "+operator+" "+num2+"="+result);
        }



    }
}
