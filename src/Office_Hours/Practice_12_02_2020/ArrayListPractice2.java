package Office_Hours.Practice_12_02_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A', 'A', 'B', 'A', 'A', 'C', 'D', 'C', 'A'));

        // REMOVE ALL 'A' FROM ARRAY LIST
        list.removeAll(Arrays.asList('A'));   // removes matching objects
        System.out.println(list);

        // keep c , b
        list.retainAll(Arrays.asList('C', 'B')); // removes not matching objects
        System.out.println(list);


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(95,85,75,65,55,45,35,25,15));
        numbers.removeIf(p->p <= 75);
        System.out.println(numbers);



    }
}
/*
remove
removeAll
retainAll
removeIf
 */