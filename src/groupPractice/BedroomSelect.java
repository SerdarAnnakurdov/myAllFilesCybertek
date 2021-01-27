package groupPractice;

public class BedroomSelect {
    public static void main(String[] args) {

        int numberOfBedroom = 5;
        int startingPrice = 0;

        switch (numberOfBedroom){
            case 1 :
                System.out.println("One bedroom selected:\nStarting price is : 1000 ");


                break;
            case 2 :
                System.out.println("Two bedroom selected: ");
                startingPrice = 2000;
                break;
            case 3 :
                System.out.println("Three bedroom selected: ");
                startingPrice = 3000;
                break;
            default:
                System.out.println("Sorry there is no such a bedrooms!");
        }





    }
}
