package day51_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class CollectionIntro {
    public static void main(String[] args) {

        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(1);


        System.out.println(((ArrayList)numbers).get(0));
//        System.out.println(((LinkedList)numbers).get(0));


        Collection<String> names = new LinkedHashSet<>();
        Collection<Integer> scores = new LinkedList<>();



    }
}
