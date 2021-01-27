package day25_ArrayIntro;

public class FindMaxMin {
    public static void main(String[] args) {

        int[] numbers ={43,23,-1,65,78,100,101};
        int maxNum = 0;



        for(int i =0; i < numbers.length; i++){
            if(numbers[i]>maxNum){
                maxNum = numbers[i];

            }


        }

        int minNum = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]<minNum){
                minNum = numbers[i];

            }
        }

        System.out.println("Minimum number is: "+minNum+"\nMaximum number is: "+maxNum);










    }
}
