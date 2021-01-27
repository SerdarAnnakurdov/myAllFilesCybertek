package groupPractice2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        String name1 = "Serdar";
        String name2 = "Mekan";

        String[] names = {name1,name2};


        ArrayList<String> arrNames = new ArrayList<>(Arrays.asList(names));
        arrNames.removeIf(p->p.equals("Serdar"));





        System.out.println(arrNames);




    }
}
