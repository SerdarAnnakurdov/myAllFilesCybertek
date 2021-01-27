package day10_ifElseStatement;

public class MinimumNumber {
    public static void main(String[] args) {
        int n1 = 200;
        int n2 = 10000;
        int n3 = 300;

        boolean n3IsMin = n3 < n1 && n3 < n2;// if n3 is less than both n1n2, it means that n3 is the minimum
        boolean n2IsMin = n2 < n1 && n2 < n3;
               // !n3IsMin && n2 < n3; if n3 isnt minimum num and n2 is less than n1
        boolean n1IsMin = !n3IsMin && !n2IsMin ;
                        // n1 < n3 && n1 < n2 ...
        String ar = " is minimum";
        int min = 0 ;

        if(n3IsMin){
            //System.out.println(n3+ar);
            min = n3; // we are't just finding min # , but also making ittobe reusable...
        }
        if(n2IsMin){
            //System.out.println(n2+ar);
            min = n2;
        }
        if(n1IsMin){
            //System.out.println(n3+ar);
            min = n1;

        }
        System.out.println(min+ar);










    }
}
