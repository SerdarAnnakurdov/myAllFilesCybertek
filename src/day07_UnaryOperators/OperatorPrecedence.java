package day07_UnaryOperators;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int x = 2 + 3 * 2 / 1;
        int y = 2 + 3 *4/3;

        int s = (2 +3 ) * 2;
                // 5 * 2 = 10...
        int r = 2 + 3 * 2 ;
                // 2 + 6 = 8....
        int w = 78 / 2 * 2 + 3 - 5 % 5 ;

        int t = 8 + 2 + 3 + 5 - 2 - 1 - 0 + 1 * 2 ;
        int m = 78 /2 *2 +3 -5 % 5;
        // 39 * 2 +3 - 5 % 5
        // 78 +3 - 5 % 5
        // 78 + 3 - 0
        // 81 - 0 = 81 .





        System.out.println(y);
        System.out.println(x);
        System.out.println(w);
        System.out.println(t);





    }





}
