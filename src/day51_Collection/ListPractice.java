package day51_Collection;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        //List (I) : has index numbers , accepts duplicated objects

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5));
        list1.removeIf(p -> p < 5);
        System.out.println(list1.get(4));
        System.out.println(list1);


        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5)); // faster
        list2.removeIf(p -> p < 5); // faster than ArrayList
        System.out.println(list2.get(4));
        System.out.println(list2);


        List<Integer> list3 = new Vector<>(); // synchronized Thread - safe
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5));
        list3.removeIf(p->p<5);
        System.out.println(list3);




        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(15,25,35,45));
        System.out.println(list4);

        ((Stack<Integer>) list4).pop();  // pop(); method -->> removes 45 last index of

        System.out.println(list4);

        ((Stack<Integer>) list4).pop(); // one more time last object will be moved out '
        System.out.println(list4);

        ((Stack<Integer>) list4).pop(); // one more last obj removed
        System.out.println(list4);

        System.out.println("==================================================================");

        Stack<String> names = new Stack<>();
        names.addAll(Arrays.asList("Aysel","Amir","Bursa","Necdat","Break"));
        System.out.println(names);
        names.pop();
        System.out.println(names);
        names.pop();
        System.out.println(names);




    }
}
