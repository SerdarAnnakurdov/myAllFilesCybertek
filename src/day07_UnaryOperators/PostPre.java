package day07_UnaryOperators;

public class PostPre {
    public static void main(String[] args) {

        int a = 1;
        int b = -a--+a++ / -a-- * --a;
        // b = - 1 + 0 / - 1 *
        //b = - 1 + 0 * 1
        // b = -1 + 0 = -1
        System.out.println(b);
        System.out.println("+++++++++++++++++++++++++++");

        int t=50;
        int u= --t +t++   +  t-- * t++;
        //     t 49 + 49 +     50 +  49  at the end will be 50;
        //  t = 98 + 50 + 49
        // t = 148 + 49
        // t = 197
        System.out.println(u);
        System.out.println("=====================");
        int x = 4;
        int y = x * 4 - x++;
        System.out.println(y);
        System.out.println("====================" );

        int j = 100;
        int p = - ++j * -j-- / j++ + --j;
        // p = - 101 * -101 / 100 + 100
        //p = 10201 /100 + 1000
        //p = 102 + 100
        //p = 202
        System.out.println(p);

        System.out.println("==================");

        int q = 29;
        int o = -q-- + ++q * -q++ / --q;
        // q = - 29 + 30 * 30 / 29;
        // q = 30 * 30 = 90 / 29 = 3 - 29 =

        System.out.println("==========================");


        int n = 10;
        int m = ++n - n-- + n-- + ++n;

        /*
11 - 11 + 10 + 11



         */
        System.out.println(m);






















    }
}
