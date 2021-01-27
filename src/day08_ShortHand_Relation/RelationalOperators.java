package day08_ShortHand_Relation;

public class RelationalOperators {
    public static void main(String[] args) {
        int num1 = 324;
        int num2 = 678;

        boolean r1 = num1 > num2;
        boolean r2 = num2 > num1;
        boolean r3 = num1 < num2;// num1 is less than num2
        boolean r4 = num2 < num1; // num2 less than num1 ;

        System.out.println(num1+" is greater than "+num2+" : "+r1);
        System.out.println(num2+" is greather than "+num1+" : "+r2);
        System.out.println(num1+" is less than "+num2+" : "+r3);
        System.out.println(num2+" is less than "+num1+": "+r4);

        System.out.println(10>9);
        System.out.println(1<0);

        System.out.println("======================");
        System.out.println(10 > 10 ); // false
        System.out.println(10 >= 10); // 10 is greater or = to 10 ,,
        System.out.println(10<9);/// false
        System.out.println(10 <= 9);// 10 is less or equal to 9 => false

        System.out.println("============================");
        boolean b1 = 10 == 10;
        boolean b2 = 10!= 10 ;
        boolean b3 = "Cybertek" == "virginia";
        boolean b4 = "virginia" == "Virginia"; // false becouse second V is uppercase
        boolean b5 = "Muhtar" == "Muhtar";
        boolean b6= "Muhtar"!="Good Guy";

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);

        int x =  100;
        boolean isEven = x % 2 == 0; // 100 is evenly divisible by 2 ...
        // even number ; is any number can be divisible by 2 with 0 remainder ....

        boolean isOdd = x % 2 !=0; // opposite of even
        // System.out.println("10">9); text to number is complain















    }
}
