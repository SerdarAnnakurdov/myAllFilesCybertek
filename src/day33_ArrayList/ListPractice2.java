package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice2 {
    public static void main(String[] args) {

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(10);
        list2.add(100);
        list2.add(300);
        list2.add(100);
        list2.add(1000);
        list2.add(400);

        int max = list2.get(0);
        int min = list2.get(0);


        for (int eachElement : list2) {
            if (eachElement > max) {
                max = eachElement;

            }

            if(eachElement<min){
                min = eachElement;
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("========MathClass============");
        /*
         max = Math.max(each, max );
            min = Math.min(each, min);   easiest waya to max min it !
         */







    }
}
