package day11_MultiBranchIf;

public class MaxMinTernary {
    public static void main(String[] args) {

        int a = 1022201;
        int b = 222001;

        int max1 = 0;
        if(a>b){
            max1 = a;
        }else{
            max1 = b;
        }
        System.out.println("Maximum number is : "+max1);

        int max2 = (a>b)? a : b;   /// mAximum number in ternary ....

        System.out.println("Maximum number is : "+max2);

        System.out.println("========================================");

        int min1 = 0; // minimum if else _ FULL CONDITION

        if(a<b){
            min1 = a;
        }else{
            min1 = b;
        }
        System.out.println("Minimum number is : "+min1);
                    // If else in short condition

        int min2 = (a<b)? a : b;
        System.out.println("Minimum number is : "+min2);










    }
}
