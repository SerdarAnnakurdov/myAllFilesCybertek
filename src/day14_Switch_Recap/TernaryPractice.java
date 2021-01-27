package day14_Switch_Recap;

public class TernaryPractice {
    public static void main(String[] args) {
        int num = 100;
        String result1 = (num%2 !=0) ? "Odd number" :"Even Number";

        System.out.println(result1);

        String result2=(num>0)?"It's positive" :(num<0)?" negative": "Zero";
        System.out.println(result2);


        int n = 6;
        String day = (n==1)?"Monday":(n==2)?"Tuesday":(n==3)?"Wednesday":(n==4)?"Thursday":
        (n==5)?"Friday":(n==6)?"Saturday":"Sunday";
        System.out.println(day);











    }
}
