package day26_Arrays;

public class MinimumNumberArray {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8};

        int min = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]<min){
                min = numbers[i];
            }

        }
        System.out.println("min = "+min  );




    }
}
