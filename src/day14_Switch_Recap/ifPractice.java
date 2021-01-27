package day14_Switch_Recap;

public class ifPractice {
    public static void main(String[] args) {
        // if & else : 2 options
        int n = 10000;

        if (n % 2 != 0) {
            System.out.println(n + " is odd number ");
        } else {
            System.out.println(n + " is even number ");
        }

        System.out.println("-------------------");
        int age = 19;
        if (age >= 18) {
            System.out.println("You are eligible to get license");
        } else {
            System.out.println("not eligible to get license ");
        }

        System.out.println("----------------");
        char grade = 'A';
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("You passed the class");
        } else {
            System.out.println("You did not pass the class");
        }
        System.out.println("---------------------------");
        int n1 = 100;
        int n2 = 200;

        if (n1 > n2) {
            System.out.println(n1 + " is greater than " + n2);
        } else if (n2 > n1) {
            System.out.println(n2 + " is greater than " + n1);
        } else {
            System.out.println(n1 + " is equal to " + n2);
        }
        System.out.println("--------------------------------");
        int num = 8;
        if (num == 1) {
            System.out.println("Monday");
        } else if (n == 2) {
            System.out.println("Tuesday");
        } else if (n == 3) {
            System.out.println("Wednesday");
        }else if(n==4){
            System.out.println("Thursday");
        }else if(n==5){
            System.out.println("Friday");
        }else if(num==6){
            System.out.println("Saturday");
        }else if(num==7){
            System.out.println("Sunday");
        }else{
            System.out.println("There is no more days a week");
        }

        System.out.println("=====================================");
        int age1 = 32;
        if(age1<21){
            System.out.println("Teenager");
        }else if(age1>=21 && age1 <= 55){
            System.out.println("Adult");
        }else{
            System.out.println("Senior");
        }
        System.out.println("---------------------------------------");
        int AGE = 2;

        if(AGE>=1&&AGE<=150){
            if(age<21){
                System.out.println("Teenager");
            }else if(age>=21&&age<=55){
                System.out.println("Adult");
            }else{
                System.out.println("Senior");
            }
        }else{
            System.out.println("Invalid Age");
        }
        String str = (AGE>=1 && AGE<=150)?(AGE<21)?"Teenager":(AGE>=21&&AGE<=55)?"ADULT":
                "Sernior":"Invalid age";

        System.out.println("==============================");

















    }
}
