package day53_Collection;

import java.util.*;

public class IteratorPractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 0, 5, 3, 3, 3, 4, 5, 6, 7, 8, 9, 6, 4, 3, 45, 6, 8, 9, 5, 32, 3, 6, 87));
//        list.removeIf(p -> p < 5);

//        for(int i=0;i<=list.size()-1;i++){
//           if( list.get(i)<5){
//               list.remove(i);
//           }
//        }

//        for(Integer each:list){
//            if(each<5){
//                list.remove(each);
//            }
//        }

        Iterator<Integer> it1 = list.iterator();  // hasNext(); checks if there is enough elements that can be iterated,return boolean

        while (it1.hasNext()) {
            if (it1.next() < 5) {
                it1.remove();
            }
        }


        System.out.println("==========================================================");

        Set<Double> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(1.5,1.6,4.0,6.0,1.5));




        // kinda for loop which is using to collection removing adding etc ...
        // Iterator need to remove add from collection types .....
        for(Iterator<Double> i = set.iterator();i.hasNext();){
            if(i.next()<4.5){
                i.remove();
            }
        }
        System.out.println(set);

        System.out.println("========================================================");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Muhtar","Daniel","aHmEd","Ahmed","aHMED"));
//        names.removeIf(p->p.equalsIgnoreCase("ahmed"));

        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            String eachName = it.next();
            if(eachName.equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }



    }
}
