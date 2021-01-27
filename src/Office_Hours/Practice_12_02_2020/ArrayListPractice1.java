package Office_Hours.Practice_12_02_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 20, 30, 40, 50, 60, 70));

        System.out.println(list.isEmpty());
        System.out.println(list.size() - 1);

        int lastIndex = list.size() - 1;


        int n1 = list.get(lastIndex);

        System.out.println(n1);


        list.set(3, 400);

        System.out.println(list);

        Integer[] arr2 = {100, 200, 300, 400, 500, 600,};

        list.addAll(Arrays.asList(arr2));

        System.out.println(list);


        int[] arr3 = {1000, 2000, 3000, 4000,};

        for (int each : arr3) {
            list.add(each);
        }
        System.out.println(list);

// this is to verify is contained to the lsit or not  !!
        System.out.println(list.contains(10000));
        System.out.println(list.indexOf(10000) >= 0);

        list.clear();

        list.addAll(Arrays.asList(-1,-2,-3,-4,-5,-6));
        System.out.println(list);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5));

        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,4,3,2,5));
        System.out.println(list2.equals(list3));


        Collections.sort(list2);
        Collections.sort(list3);

        System.out.println(list2.equals(list3));






    }
}
