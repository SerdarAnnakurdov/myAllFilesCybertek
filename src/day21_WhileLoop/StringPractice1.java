package day21_WhileLoop;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine(); // "Java"

        int lastIndex = word.length() - 1;
        char f = word.charAt(0);
        char l = word.charAt(lastIndex);

        System.out.println("" + f   +   l); // double code in this statement brings you STRING from charAT..
                      //    106 +  97 = 203..

        String r1 = "Batch "+2+1;
        //          "Batch 2"+1
        //          "Batch 21"


        System.out.println("================================");

        while(true){
            System.out.println("Enter building number:");
            String buildingNumber = scan.nextLine();
            scan.nextLine();

            System.out.println("Enter street name:");
            String streetName = scan.nextLine();

            System.out.println("Enter your apartment number:");
            String apartmentNumber = scan.nextLine();

            scan.nextLine();

            System.out.println("Enter city name:");
            String city = scan.nextLine();

            System.out.println("Enter your state name :");
            String stateName = scan.nextLine();

            System.out.println("Enter your zip code:");
            int zip = scan.nextInt();

            String fullAddress = buildingNumber+" "+streetName+", apt#  "+apartmentNumber+"\n "+city+", "+stateName+" "+zip;
            System.out.println("Your full address is: "+fullAddress);

            System.out.println("Would you like to continue ? yes , No ");
            String answer = scan.next();

            if(answer.equalsIgnoreCase("no")){
                break;
            }
        }




        // String buildingNumber (next() )
        // String street ( nextLine() )
        // String apartmentNumber (next() )
        // String CityName ( nextLine() )
        // String state ( nextLine() )










    }
}
