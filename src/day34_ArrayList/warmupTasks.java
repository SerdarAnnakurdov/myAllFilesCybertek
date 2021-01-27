package day34_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class warmupTasks {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(1, 40);

        System.out.println(numbers);

        numbers.set(numbers.size() - 1, 0);

        System.out.println(numbers);

        numbers.clear();


        System.out.println(numbers.isEmpty());

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);


        System.out.println("========multiplying odd numbers===================");
        for (int i = 0; i <= numbers.size() - 1; i++) {
            int each = numbers.get(i);  // unboxing compleate by compiler
            if (each % 2 != 0) {
                numbers.set(i, each * 2);
            }
        }

        System.out.println(numbers);

        System.out.println("======================================================");

        int[] scores = {65, 75, 77, 85, 68, 88, 82, 72, 95, 99, 98, 55,-1};

        ArrayList<Integer> Alist = new ArrayList<>();
        ArrayList<Integer> Blist = new ArrayList<>();
        ArrayList<Integer> Clist = new ArrayList<>();
        ArrayList<Integer> Dlist = new ArrayList<>();
        ArrayList<Integer> Flist = new ArrayList<>();


        for (int each : scores) {
            if (each >= 0 && each <= 100) {


                if (each >= 90) {
                    Alist.add(each);
                } else if (each >= 80) {
                    Blist.add(each);
                } else if (each >= 70) {
                    Clist.add(each);
                } else if (each >= 60) {
                    Dlist.add(each);
                } else {
                    Flist.add(each);
                }
            }else{
               continue;
            }
        }
        System.out.println("total number of A: "+Alist.size());
        System.out.println("total number of B: "+Blist.size());
        System.out.println("total number of C: "+Clist.size());
        System.out.println("total number of D: "+Dlist.size());
        System.out.println("total number of F: "+Flist.size());





    }
}
/*
warmup tasks:
    1. write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];
                output: [1,2,3,4,0];
    2. write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]

 */