package groupPractice3.people;

import java.util.ArrayList;
import java.util.Arrays;

public class peopleObj {
    public static void main(String[] args) {

        sportMan ser = new sportMan("Serdar","Annakurdov","DoingSometh",27,true,true);
        //System.out.println(ser);


        sportMan agosh = new sportMan("Agosh","Aliev","Farting",19,false,false);
        //System.out.println(agosh);
        



        ArrayList<sportMan> sportMans = new ArrayList<>(Arrays.asList(agosh,ser));

        //sportMans.removeIf(p->p.firstName.equalsIgnoreCase("agosh"));
        System.out.println(sportMans);

        System.out.println(sportMans.get(1));














    }
}
