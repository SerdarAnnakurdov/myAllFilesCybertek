package Office_Hours.Practice_12_02_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxMin {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));


        ArrayList<Integer> temp  = new ArrayList<>();
        temp.addAll(list);


        list.removeAll(Arrays.asList(Collections.max(list),Collections.min(list)));  // removes all the maximum numbers

        int secondMaximum = Collections.max(list);
        int secondMinimum = Collections.min(list);


        System.out.println("second maximum = " +secondMaximum);
        System.out.println("second minimum = " +secondMinimum);






    }
}
