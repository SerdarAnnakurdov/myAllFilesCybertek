package day08_ShortHand_Relation;

public class ShortHandOperators {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        a = 30;
        System.out.println(a);

        String schoolName = "Cybertek School";
        schoolName = "MIT";
        System.out.println(schoolName);

        int q = 10; // substruction assinghment
            q -=5;
        System.out.println(q);
        int r = 100;
            r -=62;
        System.out.println(r);

         int salary = 100_000; // 0.28 taxRate
             salary -= salary * 0.28;
             // salary -= 28000;
            // salary = salary - 28000;
           // salary = 100000 - 28000 = 72000;
        System.out.println(salary);

        int x2 = 999999;
         x2 -= 25;
        System.out.println(x2);

        double balance = 2000;
        balance -= 450;
        System.out.println(balance);

        int iphone = 2;
        iphone *= 4;
        System.out.println(iphone);

        int balance1  = 1000;
        balance1 += 500;
        System.out.println(balance1);

        int y2 = 400;
        y2 += 10000 * 0.1;
        System.out.println(y2);

        String name = "cyberteck";              // assighnments
        name += " School";                         // assighnments
        System.out.println(name);               // assighnments
                                                // assighnments
        double totalTax = 100000;
        totalTax *= 0.28;
        System.out.println(totalTax);


        int y3 = 5000;
        y3 *= 2+2;
        System.out.println(y3);

        int a1 = 10;
        a1 /= 5;
        System.out.println(a1);

        double monthlyPayments = 500000;
        monthlyPayments /= 240;
        System.out.println(monthlyPayments);


        int a2 = 100;
        a2 %= 3;
        System.out.println(a2);

        int a3 = 2000;
        a3 %= 2;
        System.out.println(a3);












    }
}
