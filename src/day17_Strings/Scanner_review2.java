package day17_Strings;
import java.util.Scanner;
public class Scanner_review2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String product = input.nextLine();

        System.out.println("Enter the price: ");
        double price = input.nextDouble(); // we have to hit enter to submit the info ...

        input.nextLine(); // the enter from the above method will be absorbed ...

        System.out.println("Enter the quantity: ");
        int quantity = input.nextInt();

        input.nextLine(); // this is you have to use nextLine which is more words than one you have to add this lane...

        System.out.println("Enter their full name: ");
        String fullName = input.nextLine();

        System.out.println(product);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println(fullName);
        System.out.println(fullName+ " your order for "+quantity+" "+product+" has been placed .Your total is "+price);



    }
}
