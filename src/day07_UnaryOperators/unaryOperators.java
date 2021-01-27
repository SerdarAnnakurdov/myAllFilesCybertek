package day07_UnaryOperators;

public class unaryOperators {
    public static void main(String[] args) {
        int a = -100;
        boolean possitive = a > 0; // verify a is positive;
        boolean negative = a < 0 ;// verify a is negative :
        System.out.println(a+" is positive : "+possitive);
        System.out.println(a+" is negative : "+negative);

        int b = -100 - 20; // - by - will give plussed to value
        System.out.println(b);
        int c = 10 - - 20; // - and - gives you +
        System.out.println(c);
        int d = - 10 * 4;// -40
        int y = 10 * -4 ; // - 40
        int f= -10 * -4; // 40
        int k = +4+-4;// 0
        System.out.println(k);
        System.out.println("==================================================");

        int x = 100;
        ++x;//increases the value by 1 .. 100+1=101.  ++ INCREAMENT

        System.out.println(x);
        int p = 100;

        --p;//decrise the value by 1 .. 100-1=99.      -- DECREAMENT
        System.out.println(p);


        int z =100;
        System.out.println(--z);
        int g =100;
        System.out.println(++g); /// pre - changed 1 value emidiatly

        int a2= 100;
        System.out.println(a2++); // post after the veriable
        System.out.println( a2 );
        int b2 = 100;
        System.out.println(b2-- );
        System.out.println(b2);


        int num1 = 30;
             num1 /= 2;
        System.out.println(num1);








    }
}
