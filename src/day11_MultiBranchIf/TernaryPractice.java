package day11_MultiBranchIf;

public class TernaryPractice {
    public static void main(String[] args) {
        int n = 100;
        String result1 = "";

        if(n%2==0){
            result1 = "Even";
        }else{
            result1 = "Odd";
        }
        System.out.println("This vsalue is : "+result1);

        String result2 = (n%2==0) ? "Even" : "Odd"; /// this is shortcat of upper example...
        System.out.println("===================================");

        int age = 25;
        String citizen = "USA";
        String eligibleToVote = (age >= 18 && citizen == "USA") ? "Eligible to Vote " : "You cant Vote";
        System.out.println(eligibleToVote);

        System.out.println("==================================");

        int age1 = 21;
        String buyAlcohol = (age1>=21) ? "Eligible to buy " : " Not Eligible to buy";
        System.out.println(buyAlcohol);

        System.out.println("==================================================");

        int num = -1000;
        String s1 = "";

        if(num > 0){
            s1 = "Positive";
        }else if(num < 0){
            s1 = "Negative";
        }else{
            s1= "Zero";
        }
        System.out.println(s1);
        System.out.println("===================="); // next in ternary

        String s2 = (num > 0) ? "Positive" :(num < 0) ? "Negative" : "Zero";
        System.out.println(s2);
















    }
}
