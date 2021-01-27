package day16_Scanner;
/*
task :
    Count up some points based on the users input:
    ask the user how many people they live with ?
    if user lives with less than 2 people: add one point
    if the user lives with 3-6 people: add two points
    if user lives with more than 6 people: add three points

ask the user what city they live in ?
ask the user if they live in downtown (yes or no )
    if you live downtown, ask them have you thought about moving to the suburbs ? (yes or no )
    if they have thought about it, add one point
    if no, minus one point..

ask the user their favorite animal?
ask the user how many pets they want ?
ask ssn?
print everything add points ...

 */
import java.util.Scanner;
public class AllYourPersonalInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int points = 0;
        System.out.println("How many people do you live with ? ");
        byte liveWithNumber = input.nextByte();
        if(liveWithNumber>0 && liveWithNumber<=12){
            if(liveWithNumber<=2){ // this can be only 1 ~ 2
                System.out.println("You live with less than 2 people ");
            }else if(liveWithNumber<7){ // include 3 ~ 6
                System.out.println("You live with less than 3 -6 people");
            }else{
                System.out.println("You live with less than 6 people");
            }

        }else{
            System.err.println("Not a valid number of people");
        }


    }
}
