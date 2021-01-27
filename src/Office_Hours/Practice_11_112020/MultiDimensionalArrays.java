package Office_Hours.Practice_11_112020;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int[] arr1D = {1, 2, 3, 4};
        //             0  1  2  3
        int[][] arr2D = {{1, 2, 3, 4}, {1, 2, 3,}, {2, 3, 4,}};

        System.out.println(arr2D[2]);
        //      0              1
        System.out.println(Arrays.toString(arr2D[2]));
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println("===============================");


        for (int[] each : arr2D) {
            System.out.println(Arrays.toString(each));


            for (int eachElement : each) {
                System.out.println(eachElement);

            }
        }
        System.out.println("================================");

        for (int[] each : arr2D) {
            for (int eachElement : each) {
                if (eachElement % 2 != 0) {
                    System.out.println(eachElement);

                }
            }
        }


    }

}
