package groupPractice;

import day36_CustomClass.Serdar;
import day37_CustomClass.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class SerdarCustom2 {
    public static void main(String[] args) {


        SerdarCustom serdarCustom1 = new SerdarCustom();
        serdarCustom1.setInfo("Serdar",'M',122311);


        ArrayList<SerdarCustom> list = new ArrayList<>(Arrays.asList(serdarCustom1));

        System.out.println(list);











    }
}
