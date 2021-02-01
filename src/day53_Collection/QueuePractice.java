package day53_Collection;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {


        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10, 12, 9, 8, 11, 5, 4, 7, 6, 3, 2, 1));
        System.out.println("arrayDeque = " + arrayDeque);
        arrayDeque.poll();
        arrayDeque.poll();
        arrayDeque.poll();
        System.out.println("arrayDeque = " + arrayDeque);

        ((ArrayDeque) arrayDeque).getFirst();

        //ArrayDeque does not take null ...

        System.out.println("=======================================================");

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10, 12, 9, 11, 5, 4, 7, 6, 3, 2, 1));
        System.out.println("linkedList = " + linkedList);
        linkedList.poll(); //1o out 
        linkedList.poll(); //12 out 
        System.out.println("linkedList = " + linkedList);

        System.out.println(((LinkedList) linkedList).get(0));
        System.out.println(((LinkedList) linkedList).get(linkedList.size() - 1));
        System.out.println(((LinkedList) linkedList).getFirst());
        System.out.println(((LinkedList) linkedList).getLast());
        linkedList.add(null);

        System.out.println("linkedList = " + linkedList);


        System.out.println("===============================================================");

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(1,10,12,91));
        System.out.println("priorityQueue = " + priorityQueue);
        priorityQueue.poll();
        System.out.println("priorityQueue = " + priorityQueue);

//        System.out.println(((PriorityQueue)priorityQueue).getFirst()); no rel thats why can use those methods
//        priorityQueue.add(null); priorityQueue does not accept null ...
                

        

    }
}
