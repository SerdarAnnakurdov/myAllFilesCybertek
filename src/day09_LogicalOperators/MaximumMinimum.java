package day09_LogicalOperators;

public class MaximumMinimum {
    public static void main(String[] args) {
        int n1 = 2000;
        int n2 = 200;

        boolean n1IsMax = n1 > n2;//n1 is to be max num
        boolean n2IsMax = n2 > n1; // n2 is to be max num
        boolean equal   = !n1IsMax && !n2IsMax ; // n1 is equal to n2

        if(n1IsMax){
            System.out.println(n1+" is maximum number ");
        }

        if(n2IsMax){
            System.out.println(n2+" is maximum number ");
        }

        if(equal){
            System.out.println(" Both are equal ");
        }

        boolean n1IsMin = n1<n2; // n1 to be max number
        boolean n2isMin = n2<n1;// n2 to be max number

        if(n1IsMin){
            System.out.println(n1+"is minimum");
        }
        if(n2isMin){
            System.out.println(n2+" is minimum");
        }

        //boolean equal   = !n1IsMax && !n2IsMax ; // n1 is equal to n2









    }
}
/*
2. write a program that can print out the maximum number between two numbers
        Ex:
            num1 = 20;
            num2 = 30;
            output:
                30 is the maximum number
            num1 = 20;
            num2 = 20;
            output:
                both numbers are equal
    3. write a program that can print out the minimum number between two numbers
        Ex:
            num1 = 20;
            num2 = 30;
            output:

 */