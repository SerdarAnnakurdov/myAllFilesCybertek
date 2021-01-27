package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice1 {
    public static void main(String[] args) {

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                even.add(i);

            } else {
                odd.add(i);
            }

        }

        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);


        System.out.println("Last odd number : " + odd.get(odd.size() - 1));
        System.out.println("Last even number: " + even.get(even.size() - 1));

        System.out.println("====================Concat2arrays============================");

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};


        ArrayList<Integer> list1 = new ArrayList<>();

        for(int each:arr1){
            list1.add(each);
        }
        for(int each :arr2){
            list1.add(each);
        }

        System.out.println(list1);

        System.out.println("============2DarraysConcat=================");


        int[] arr11 = {1,2,3,4,5};
        int[] arr22 = {6,7,8,9,10};
        int[] arr33 = {11,12,13,14};


        int[][] arr2D = {arr11,arr22,arr33};



        ArrayList<Integer> list11 = new ArrayList<>();

      for(int[] each1D : arr2D){
          for(int eachElement: each1D){
              list11.add(eachElement);
          }
      }
        System.out.println(list11);











    }
}
