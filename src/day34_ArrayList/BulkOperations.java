package day34_ArrayList;

import com.sun.xml.internal.rngom.digested.DGroupPattern;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        // contains all
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(70);

        // verify if 10 is contained in the list
        boolean r1 = list.contains(10);

        // verify if 10 , 30 , 50  & 60 are contained in the list
        boolean r2 = list.contains(10) && list.contains(30) && list.contains(50) && list.contains(60);


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);


       boolean r3 =  list.containsAll(  Arrays.asList(10, 30, 50, 60)  );

        System.out.println(r3);

        System.out.println("=================BulkOperation============================");

        ArrayList<String> group1 = new ArrayList<>();
        group1.add("Mohammad");
        group1.add("Svetlana");
        group1.add("Ahmed");
        group1.add("Ercan");

        // Ahmed , Ercan , Biden
        boolean r4 =  group1.containsAll(  Arrays.asList("Ahmed","Ercan","Biden"));
        System.out.println(r4);

        // Mohammad , Ahmad , Svetlana
         boolean r5 =  group1.containsAll(Arrays.asList("Mohammad","Ahmad","Svetlana"));
        System.out.println(r5);


        System.out.println("==========================================");

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A','Z','C','B','H','I','K'));

        System.out.println(chars);

        String[] names = {"Muhtar","Asia","Akbar","Valo","Stan","Halk"};
        ArrayList<String> students = new ArrayList<>(Arrays.asList(names));
        //students.addAll(Arrays.asList(names));

        System.out.println(students);

        ArrayList<Character> ch1 = new ArrayList<>(Arrays.asList('A','B','C','D','E'));
        ch1.addAll(Arrays.asList('J','K','L','M','N'));

        System.out.println(ch1);

        System.out.println("========================================");

        ArrayList<String> group2 = new ArrayList<>();
        group2.addAll(Arrays.asList(names));

        System.out.println(group2);
/*
        group2.remove("Halk");
        group2.remove("Valo");
        group2.remove("Akbar");
        */


        group2.removeAll(Arrays.asList("Muhtar","Asia","Akbar","Valo","Stan"));

        System.out.println(group2);


        System.out.println("==================================================");
        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ahmed","Ahmed","Erjon","Ahmed","Ahmed","Ahmed","Adil","Afrooz"));
/*

        for(int i=0;i<=employees.size()-1;i++){
            if(employees.get(i).equals("Ahmed") ){
                employees.remove(i); // whitout interface interable , remove method cannot be usen in the loop
            }
        }
        System.out.println(employees);

 */
        employees.removeAll(Arrays.asList("Ahmed"));

        System.out.println(employees);


        System.out.println("================================");

        ArrayList<String> employees2 = new ArrayList<>();

        employees.addAll(Arrays.asList("Ahmed","Ahmed","Erjon","Ahmed","Ahmed","Ahmed","Adil","Afrooz"));

        System.out.println(employees2);

        employees2.retainAll(Arrays.asList("Ahmed"));
        System.out.println(employees2);





















    }


}
