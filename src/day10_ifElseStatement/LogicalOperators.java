package day10_ifElseStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        // || - or logic ; returns false if all expressions are false,
        boolean r1 = 10 < 9 || 20 != 20;
                // false    ||   false
        System.out.println(r1);

        boolean r2 = "Muhtar" == "Good Guy" || "Muhtar" !="Bad Guy";
                            // false            true
        System.out.println(r2);

        boolean r3 = 'a' != 'A' || 'B' == 'B';
                    // true         // true
        System.out.println(r3);

        // && logic
        boolean r4 = 200 > 100 && 200 < 300 ;
                //      true     &&  //  true
        System.out.println(r4);

        boolean r5 = true && false ;
                       // false
        System.out.println(r5);


        // ! logical opposite of the boolean

        System.out.println(!true);
        System.out.println(!false);
        System.out.println();





    }
}
