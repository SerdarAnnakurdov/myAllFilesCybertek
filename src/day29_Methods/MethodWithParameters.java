package day29_Methods;

public class MethodWithParameters {
    public static void main(String[] args) {



        eligibleToBuyAlcohol(12);

        calculateAge(2018,2015);
        calculateAge(1965,2020);
        calculateAge(1992,2020);





    }
    public static void eligibleToBuyAlcohol(int age){
        if(age>=21){
            System.out.println("Eligible to buy alcohol ");
        }else{
            System.out.println("Not Eligible");
        }
    }

    public static void calculateAge(int birthYear, int currentYear){
        if(birthYear<currentYear){
            System.out.println("Your age is : "+ (currentYear-birthYear)+" years old sir");
        }else{
            System.out.println("Invalid Entry ");
        }

    }
}
