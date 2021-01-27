package day14_Switch_Recap;

public class ifStatementWithousCorlyBraces {
    public static void main(String[] args) {
        int a = 10;
        if(a%2==0){
            System.out.println("even number");
            System.out.println(a+" is even number");
        }else{
            System.out.println("odd number ");
            System.out.println(a+" is odd number ");
        }
        System.out.println("===================================");

      int b = -0;
        if(b>0) System.out.println("Positive");
        else if(b<0) System.out.println("Negative"); // this is kind of only for one statement
        else System.out.println("Zero");                // without {} ... only one STATEMENT

        System.out.println("==========================");
        int number = 5;                       // without { } { } { } { } { } - YOU CANT USE ONLY ONE STATEMENT
        String day = "";

        if(number>=1&&number<=7)              // ONLY ONE STATEMENT YOU CAN USE WITHOUT "{ } { } { } { }"
            if(number==1)
                day = "Monday";
            else if(number==2)                      // THIS IS ONLY ONE STATEMENT
                day="Tuesday";                      // THats kind of Example for ONE STATEMENT
            else if(number==3)                      // Not a good behavior ....
                day = "Wednesday";
            else if(number==4)
                day="Thursday";
            else if(number==5)
                day="Friday";
            else if(number==6)
                day="Saturday";
            else if(number==7)
                day="Sunday";


        else
            day="Invalid";
        System.out.println(day);


















    }
}
