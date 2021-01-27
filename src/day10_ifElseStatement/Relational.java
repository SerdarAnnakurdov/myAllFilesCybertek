package day10_ifElseStatement;

public class Relational {
    public static void main(String[] args) {

        System.out.println(10>100);//false
        System.out.println(100<10);// false
        System.out.println(10000>20);// true
        System.out.println(20<10000); // true
        System.out.println(10>=8);// true
        System.out.println(9 >=9);// true
        System.out.println(10 <= 10 );// less or equal ==> true
        System.out.println(10 <= 5);// false


        // == equal operator ;
        int a1 = 20;
        int a2 = 30;
        int a3 = 30;
        System.out.println(a2 == a3);

        char ch1 = '!';
        char ch2 = '!';
        System.out.println(ch1 == ch2);// true cz both the same .. and equal to each other


        String language1 = "Turkish";
        String language2 = "Indian";
        String language3 = "Turkish";
        System.out.println(language1 == language2);
        System.out.println(language1 == language3);










    }
}
