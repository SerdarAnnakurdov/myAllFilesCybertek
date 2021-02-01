package day51_Collection;

import java.util.*;

public class SetPractice {


    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.addAll(Arrays.asList("Daniel", "Ruslam", "Adhan", "Serhii", "Ercan", "SERDAR", "SERDAR", "SERDAR"));
        System.out.println(names);

        Set<String> names2 = new LinkedHashSet<>();
        names2.addAll(Arrays.asList("Daniel", "Ruslam", "Adhan", "Serhii", "Ercan", "SERDAR", "SERDAR", "SERDAR"));
        System.out.println(names2);

        Set<String> names3 = new TreeSet<>();
        names3.addAll(Arrays.asList("Daniel", "Ruslam", "Adhan", "Serhii", "Ercan", "SERDAR", "SERDAR", "SERDAR"));
        System.out.println(names3);

        System.out.println("===========================================================================");

        String str = "ggaabbnncc"; // gabnc
        String result = "";
//
//        for (String s : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
//            result += s;
//        }
//        String[] arr = str.split("");

        LinkedHashSet<String> hs = new LinkedHashSet<>();
        hs.addAll(Arrays.asList(str.split("")));

//        System.out.println(hs.get(0));

        for (String h : hs) {
            result += h;
        }

        System.out.println(Arrays.asList());


        System.out.println(result);

        System.out.println("================================================================");

        String str1 = "silent";   //anagram --> same letters different order makes sure anagram
        String str2 = "listen";

        String s1 = new TreeSet<>(Arrays.asList(str1.split(""))).toString();
        String s2 = new TreeSet<>(Arrays.asList(str2.split(""))).toString();

        System.out.println(s1.equals(s2));


        System.out.println("==================================================--");

        // Null key;
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(null, null, null));
        System.out.println(hashSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(null, null, null));
        System.out.println(linkedHashSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
//        treeSet.addAll(Arrays.asList(null,null,null));
//        System.out.println(treeSet);

//        String str4 = null;
//        System.out.println(str4.equals("Muhtar")); null can not be equal to Muhtar

        System.out.println("=================================================");

        Set<Integer> numbers = new HashSet<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5,5,5,5,5,5,5,5,5, 6, 7, 8, 9));


        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

//        Collections.sort(numbers);
//        Collections.swap(numbers, 0,1);
//        Collections.frequency(numbers,5);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("=================================================");


        /*
        ddddaaaaaaccccbb

        dacb
        3422

        output:
        d3a4c2b2
         */





    }
}
