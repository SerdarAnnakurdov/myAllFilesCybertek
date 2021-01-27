package day15_Scanner;

public class wramUp {
    public static void main(String[] args) {

        int numOfpeople = 50;
        int crew = 0;
        int passenger = 0;

        switch (numOfpeople){
            case 50: crew = 20; passenger=30;break;
            case 75: crew = 25; passenger=50;break;
            case 100: crew = 30; passenger=70;
            default:
                System.out.println("Invalid number of people");



        }
        System.out.println("Crew : "+crew);
        System.out.println("Passengers: "+passenger);










    }

}
/*
1) Given a number of people on the ship determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.
    Total: 50 | 20 crew, 30 passengers
    Total: 75 | 25 crew, 50 passengers
    Total: 100 | 30 crew, 70 passengers
    Any other number of people on the
 */