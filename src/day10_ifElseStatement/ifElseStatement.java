package day10_ifElseStatement;

public class ifElseStatement {
    public static void main(String[] args) {
        int number = 100;
        boolean isEven = number%2==0;

        if(isEven){
            System.out.println(number+" is even");
        }
        if(!isEven){
            System.out.println(number+" is odd ");
        }

        System.out.println("-------------------------");

        if(isEven){
            System.out.println(number+" is even");
        }else{
            System.out.println(number+" is odd");
        }
        System.out.println("--------------------------------------");

        int score = 60;
        if(score>=60){
            System.out.println("passed the exam");
        }else{
            System.out.println("Failed the exam");
        }






    }
}
