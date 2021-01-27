package day12_Nestedif;

public class EligibleTovote {
    public static void main(String[] args) {
        String citizen = "USA";
        int age = 40;

        if(citizen == "USA"){
            if(age>=18){
                System.out.println("Your are eligible to vote");
            }else{
                System.out.println("You must be at least 18 years old to vote");
            }


        }else{
            System.out.println("You must be US citizen to vote");
        }










    }
}
