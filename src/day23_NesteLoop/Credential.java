package day23_NesteLoop;

import java.util.Scanner;

/*
Credentials
log in :  cybertek
password: cybertek12345
 */
public class Credential {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name:");
        String userName = scan.next();

        System.out.println("Enter your password:");
        String password = scan.next();

        if (userName.equals("cybertek") && password.equals("cybertek12345")) { // if the requirements are valid user will be able to log in
            System.out.println("Logged in");

        } else { // condition invalid user name & password

            for (int i = 1; i <= 2; i++) {
                if (i == 2){ // if the attempt is already this times your account should be locked .... its counts here how many loops you giving to ..
                    System.err.println("Your account is locked");
                    System.exit(0); // terminates the program . . .
                }

                    System.err.println("Invalid user name or password, please re enter ");
                System.out.println("Enter your user name");
                userName = scan.next();

                System.out.println("enter your password");
                password = scan.next();

                if (userName.equals("cybertek") && password.equals("cybertek12345")) {
                    System.out.println("Logged in");
                    break;
                }

            }

        }

        System.out.println("Hello world");
    }
}
