package groupPractice;


import java.util.Scanner;

public class selfDoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("guess the password:");
        String ulanyjy = scan.nextLine();

        String password = "shalamma";

        while (!ulanyjy.equals(password)){
            System.err.println("Sorry wrong password, please try again below: ");
            ulanyjy = scan.nextLine();

        }
        System.out.println("šalamma Geldiñmaÿ");








    }
}
