package day10_ifElseStatement;

public class ifStatement {
    public static void main(String[] args) {
        int score = 69;
        if(score>=60){
            System.out.println("Congrats");
        }else{
            System.out.println("Sorry , Keep trying");
        }


        System.out.println("=============================================");
        int angle1 = 90;
        int angle2 = 75;
        int angle3 = 65;
        int angle4 = 75;

        boolean isValidRectangle = angle1 == 90 && angle2 == 90 && angle3 == 90 && angle4 == 90;
                    // is each of the angles is equal to 90 then it's valid

        if(isValidRectangle){
            System.out.println(" it's valid rectangle");
        }else{
            System.out.println(" isn't valid regtangle");
        }
        System.out.println("======================================");
        // assume that a & b are two different num
        int a = 20;
        int b = 20;
        int max = 0;

        if(a>b){
            max = a;
        }else{
            max = b;
        }
        System.out.println("Maximum number is : "+max);














    }
}
