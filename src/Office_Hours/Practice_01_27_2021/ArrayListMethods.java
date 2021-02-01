package Office_Hours.Practice_01_27_2021;

import day48_Abstraction.InterFaceRules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(20, 30, 40, 50, 60, 70));


        //list.remove(40);  this index is out of Bound thats why you got compiler
        list.remove(Integer.valueOf(40)); // this is type of by objects=value you can remove obj


        list.set(2, 300); // this is the method how you set and change index values to the other value

        boolean have500 = list.contains(500);

        Collections.swap(list, 0, 1); // this is how you swap spaces bettween indexes (yourList,firstIndex,secondIndex)
        Collections.sort(list); // this is how you sort ArrayList values


        int count = Collections.frequency(list, 50);
        System.out.println(count + " couываnt");

        list.forEach(eachElement -> {
            System.out.print(eachElement+" .");
        }); // you can not make any changes withing this kind of 'forEach' loop using just to prints out..


        System.out.println(have500);
        System.out.println(list.size());
        System.out.println(list);


    }
}
