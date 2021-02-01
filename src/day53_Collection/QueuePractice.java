package day53_Collection;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {


        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10,12,9,8,11,5,4,7,6,3,2,1));
        System.out.println("arrayDeque = " + arrayDeque);
        arrayDeque.poll();
        arrayDeque.poll();
        arrayDeque.poll();
        System.out.println("arrayDeque = " + arrayDeque);
        
        
    }
}
