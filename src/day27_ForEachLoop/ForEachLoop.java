package day27_ForEachLoop;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] names = {"Delaram", "Aysel", "Snoop", "Ayse", "Erjon"};

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();

        System.out.println("===================");

        for (String each : names) { // each is the element
            System.out.print(each + " ");

        }
        System.out.println();
        System.out.println("==============================");

        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int countEven = 0;
        int countOdd = 0;


        for (int each : number) { // each in this is elemnt of array ...
            if (each % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }

        }
        System.out.println("countOdd = " + countOdd);
        System.out.println("countEven = " + countEven);

        System.out.println("==================================");
        int[] scores = {1,2,3,4,5,6,7,8,9,-2,300,40};
        int max = scores[0];
        int min = scores[0];
        
        for( int each : scores ){
            if(each > max){
                max = each;
            }
            if(each<min){
                min = each;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        
       
        
        








    }
}
