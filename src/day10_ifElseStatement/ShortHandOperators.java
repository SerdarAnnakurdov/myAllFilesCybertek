package day10_ifElseStatement;

public class ShortHandOperators {
    public static void main(String[] args) {
        int a = 100;

        a=110;

        System.out.println(a++);
        System.out.println(a);
        a = 200;


        System.out.println(a--);
        System.out.println(a);

        a = 300;
        System.out.println(a);
        String name = "Daniel";
        System.out.println(name);

        name = "John";
        System.out.println(name);

        // += addition
        int a1 = 100;
        a1 = a1 + 100;
        a1 += 100;
        System.out.println(a1);

        String school = "Cybertek ";
          //school = school + "School";
        school += "School";// concatenation assignment
        System.out.println(school);


        int savingAccount = 1000;
        // october
        savingAccount += 2000;

        System.out.println(savingAccount);// october
        savingAccount += 500;
        System.out.println(savingAccount);




        // -=:
        savingAccount -= 1000;
        System.out.println(savingAccount);

            savingAccount -= 500;
        System.out.println(savingAccount);

        // multi *=;

        double salary = 100000.89;
        salary *= 1.2;
        System.out.println(salary);

        int y = 10;
        //y = y * 10; this is full calculation of the system ...
        y *= 10;
        System.out.println(y);

        // /=: division

        double tax = 10000;
        tax /= 2;
        System.out.println(tax);

        int b = 2000;
        b /= 7;
        System.out.println(b);


        // %=; reminder ; if numerator cant be evely divisible by denominator
        /*
        in math;
            10/4=2.5;
            remainder will be : 10 - (4 * 2) = 2 ;
            10 % 4 = 2 ;
         */

        int I = 100;
        I %= 10;
        System.out.println(I);

        int u = 35;
        u %= 9;
        /*
        35/9 = 3.88....
        remainder will be 35 - ( 9 * 3 ) = 8
         */
        System.out.println(u);

















    }
}
