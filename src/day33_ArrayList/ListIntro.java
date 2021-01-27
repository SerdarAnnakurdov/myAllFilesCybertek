package day33_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ListIntro {

    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>(); // size : 1

        scores.add(100); // autoboxing 0
        scores.add(200); //             1
        scores.add(300);//              2

        scores.add(2,400);

        System.out.println(scores);
        System.out.println("==============================");
        ArrayList<String> croceryList = new ArrayList<>();  // egg,water,milk,bread
        croceryList.add("Egg"); //3
        croceryList.add("Water");//4
        croceryList.add("Milk");//5
        croceryList.add("Bread");//6

        croceryList.add(0,"Toilet paper"); // 0
        croceryList.add(1,"Sanitizer");   // 2
        croceryList.add(1,"N95 Masks");  // 1




        System.out.println(croceryList);

        String item1 = croceryList.get(1);
        System.out.println("item1 = " + item1);

        String item2 = croceryList.get(0);
        System.out.println("item2 = " + item2);

        //System.out.println(croceryList.get(100));




        int total = croceryList.size();
        System.out.println("total = " + total);


        String lastElement = croceryList.get(croceryList.size()-1);
        System.out.println("lastElement = " + lastElement);

        System.out.println("=================================");












    }

}
