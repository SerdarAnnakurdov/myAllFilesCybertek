package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;


public class CollectionUtility {
    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();

        chars.add('X');
        chars.add('Z');
        chars.add('Y');
        chars.add('W');
        chars.add('A');


        System.out.println(chars);

        Collections.sort(chars);
        System.out.println(chars);

        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(70);
        scores.add(80);
        scores.add(60);
        scores.add(70);
        scores.add(50);
        scores.add(65);
        scores.add(75);


        Collections.sort(scores);

        System.out.println("Minimum number: " + scores.get(0));
        System.out.println("Maximum number: " + scores.get(scores.size() - 1));


        System.out.println(scores);

        Collections.swap(scores, 2, 3);
        System.out.println(scores);


        Collections.swap(scores, 0, scores.size() - 1);
        System.out.println(scores);


        Collections.swap(scores, scores.indexOf(60), scores.lastIndexOf(70));

        System.out.println(scores);


        System.out.println("========================================");

        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('A');


          /*
        for (int i = 0; i <= list.size() - 1; i++) {
           char each = list.get(i);
           if(each=='A'){
               list.set(i,'E');
           }
        }
                 */

        Collections.replaceAll(list, 'A', 'E');


        System.out.println(list);    //  [E, B, C, D, E, E, E, E, E, E]

        int frequencyofE  = Collections.frequency(list,'E');
        System.out.println(frequencyofE);

        System.out.println("==============MinimumMaximumCollectionNums====================");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(1000);
        nums.add(2300);
        nums.add(35);
        nums.add(787);
        nums.add(22);
        nums.add(10);
        nums.add(2);





        System.out.println("maximum nums: "+Collections.max(nums));
        System.out.println("minimum nums: "+Collections.min(nums));




    }
}
