package day17_Strings;
import java.util.Scanner;
public class TravelTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double cost = 0;
        System.out.println("Do you have a valid passport");
        String validPassport = input.next();

        if(validPassport.equalsIgnoreCase("yes")){
            cost=1000;


            System.out.println("Which country do you want to go to ");
            input.nextLine();// accept the enter input
            String country = input.nextLine();

            System.out.println("how many bags you will have ? ");
            byte bags = input.nextByte();
            cost +=(bags*50);// cost + (bag * 50)

            System.out.println("How many people are you traveling with ? ");
            short numberOfPeople = input.nextShort();

            if(numberOfPeople>=3){
                cost -=300; // cost = cost - 300
            }else{
                cost -=(numberOfPeople*100);
            }

            System.out.println("Enter the name of the people you will travel with ? ");
            input.nextLine();
            String namesOfPeople = input.nextLine();

            System.out.println("Your ticket is booked to "+country+". We have charged extra for the "+bags+" bags but you traveling with "+
                    namesOfPeople+" so we are giving you a discount . Your total cost is "+cost);


        }else{
            //????????????????????????????????????????????? other way we have to find it out and write in the sateament ..

        }





    }
}
