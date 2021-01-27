package Office_Hours.Practice_11_112020;

public class ArraysPractice1 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {10, 11, 12, 13, 14, 15, 1};


        for (int j = 0; j < arr1.length; j++) {
            int element = arr1[j];  //1
            for (int i = 0; i < arr2.length; i++) {
                if (element == arr2[i]) {
                    System.out.println(element);
                    break;
                }
            }

        }
        System.out.println("======================================");

        for (int element : arr1) {

            for (int each : arr2) {
                if (each == element) {
                    System.out.println(element);
                }
            }
        }


    }
}
