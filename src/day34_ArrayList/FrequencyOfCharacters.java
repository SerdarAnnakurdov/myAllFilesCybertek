package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "AAABBCDDDDEEE";
                //    a3b2c1d4e3
        String result = "";

        ArrayList<String> list = new ArrayList<>();// in order to be able to use frequency method

        for(String each :str.split("")) list.add(each); // we get every char from str and add them into arraylist

        for(String each : list){
            int frequency = Collections.frequency(list,each);
            if(!result.contains(each)) {
                result += each + frequency;
            }

        }

        System.out.println(list);
        System.out.println(result);





    }
}
