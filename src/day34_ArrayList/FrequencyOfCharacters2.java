package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfCharacters2 {
    public static void main(String[] args) {

        String str = "AAABBCDDDDEEEjjkkllmmnqq";

        String result = "";

        ArrayList<Character> list = new ArrayList<>();
        for (char each : str.toCharArray()) list.add(each);

        for (char each : list) {
            int frequency = Collections.frequency(list,each);
            if(result.contains(""+each)){
                continue;
            }

            result+= ""+each+frequency;
        }
        System.out.println(result);


    }
}
