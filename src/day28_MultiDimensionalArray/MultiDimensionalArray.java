package day28_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 2};
        //            0  1

        int[] arr2 = {3, 4, 5, 6, 7};
        //            0  1  2  3  4

        int[] arr3 = {8, 9, 10, 11, 12, 13};

        int[][] arrays = {arr1, arr2, arr3};
        //                  0      1      2


        System.out.println(arrays[1][3]);
        System.out.println(arrays[2][0]);

        System.out.println(Arrays.toString(arrays[1]));

        System.out.println(Arrays.toString(arrays));
        System.out.println(Arrays.deepToString(arrays));


        System.out.println("==========================");

        String[][] batch21 = {{"lily", "Lana", "Igor"}, {"Polina", "Serhii", "Abdujilil", "Aziz"}, {"Justina", "Itiina", "Asuman", "Plany"}};

        for(int i = 0;i < batch21.length; i++){
            String[] eachGroup = batch21[i];
            System.out.println(Arrays.toString(eachGroup)  );

            for(int j = 0; j < eachGroup.length; j++){
                System.out.println(eachGroup[j]);

            }
            System.out.println("==============ppp============");

            /*for(int p = batch21.length-1; p >= 0; p--){
                String[] eachG = batch21[p];
                System.out.println(Arrays.toString(eachG));

                for(int u = eachG.length-1; u >= 0; u--){
                    System.out.println(eachG[u]);
                    */


            for(int m = batch21.length-1; m >=0;m--){

                for(int k = batch21[m].length-1; k >= 0; k--){
                    System.out.print(batch21[m][k]+" ");
                    // reversed version


                }




            }



        }


    }
}
