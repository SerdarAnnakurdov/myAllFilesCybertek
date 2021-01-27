package day31_MethodOverLoading;

public class MethodOverloading2 {
    public static void main(String[] args) {

        System.out.println(sum(1, 1));
        System.out.println(sum(1, 1, 1));
        System.out.println(sum(1, 1, 1, 1));

        System.out.println(sum(1.5, 1.5));
        System.out.println(sum(1.5, 1.5, 1.5));
        System.out.println(sum(1.5, 1.5, 1.5));

        String str = "Cybertek School";
        String s1 = str.substring(0, str.indexOf(" "));
        String s2 = str.substring(0);


        System.out.println(s1);
        System.out.println(s2);

    }


    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return sum(a, b) + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return sum(a, b, c) + d;
    }



    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sum(double a, double b, double c) {
        return sum(a, b) + c;
    }

    public static double sum(double a, double b, double c, double d) {
        return sum(a, b, c) + d;
    }


}
