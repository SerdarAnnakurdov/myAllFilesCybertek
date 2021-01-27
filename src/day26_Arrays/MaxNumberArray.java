package day26_Arrays;

public class MaxNumberArray {
    public static void main(String[] args) {
        
        int[] numbers = { 1,99,2,3,4,5,6,7,88};
        
        int max = numbers[0];
                 // -2244342423424
        
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
                
            }
        }
        System.out.println("max = " + max);
        
        
        
        
        

    }
}
