package day33_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ListMethods {
    public static void main(String[] args) {

        ArrayList<String > names = new ArrayList<>();
        names.add("Yalcin");
        names.add("Amina");
        names.add("Ercan");
        names.add("Ercan");
        names.add("Tayfun");
        names.add("Mustafa");
        names.add("Tayfun");
        names.add("Suveyda");
        names.add("Egemen");

        System.out.println(names);

        names.set(3,"Afrooz");
        names.set(6,"Fiona");

        System.out.println(names);


        System.out.println("============replacing .setMethod================");


        int[] arr = {10,20,30,40};
        arr[1] = 200;
        System.out.println(Arrays.toString(arr));




        ArrayList<Character> list = new ArrayList<>();

        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');


        System.out.println(list);

        list.remove(2);

        System.out.println(list);

        list.remove(2);

        System.out.println(list);

        System.out.println("=============remove Character c===============");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('A');
        list2.add('B');
        list2.add('C');
        list2.add('D');
        list2.add('E');


         //Character ch = 'C';  // 64
          boolean r1 = list2.remove(Character.valueOf('C'));

        System.out.println(list2);
        System.out.println(r1);

        System.out.println("==============That's it========================");






















    }
}
