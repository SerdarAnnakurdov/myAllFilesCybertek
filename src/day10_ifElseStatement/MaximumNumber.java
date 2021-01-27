package day10_ifElseStatement;

public class MaximumNumber {
    public static void main(String[] args) {
        // assume they are three different numbers
        int n1 = 100;
        int n2 = 200;
        int n3 = 300;

        int n4 = 500;

        boolean n1ISMax = n1 > n2 && n1 > n3 && n1 > n4; // if n1is greater than both n2&n3, it means n1 is maxi
        boolean n2IsMax = n2 > n1 && n2 > n3;//if n1 isn't max, n2 is greater then n2 is max
        boolean n3IsMax = n3 > n2 && n3 > n1;
                //!n1ISMax && !n2IsMax;
                //!n1ISMax && n2 > n3


        String str = " is maximum number ";

        if(n1ISMax){
            System.out.println(n1+str);
        }
        if(n2IsMax){
            System.out.println(n2+str);
        }
        if(n3IsMax){
            System.out.println(n3+str);
        }

    }
}
/*
Task02: MaximumNumber
         write a java program that accepts three numbers and return the maximum number

 */