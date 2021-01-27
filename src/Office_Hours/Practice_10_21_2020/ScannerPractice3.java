package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your gender:");
        String gender = scan.nextLine();
        System.out.println("Gender: " + gender);

        System.out.println("Enter your age:  ");
        int age = scan.nextInt();
        System.out.println("Your age: " + age);

        scan.nextLine();// to take out enteres from scanner make them empty

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();
        System.out.println("Your full name is: " + fullName);

        System.out.println("Enter your zipCode: ");
        int zipCode = scan.nextInt();
        System.out.println("Your zip code is: " + zipCode);

        scan.nextLine();

        System.out.println("Enter your Country Name: ");
        String countryName = scan.nextLine();
        System.out.println("Your country name is: " + countryName);

        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();
        System.out.println("Your salary is: " + salary);

        scan.nextLine();

        System.out.println("Enter your company name: ");
        String companyName = scan.nextLine();
        System.out.println("Your company name is: " + companyName);

        System.out.println("Enter your address: ");
        String address = scan.nextLine();
        System.out.println("Your adress is: " + address);













        /*
        1. ask gender next();
        2. ask age nextInt();
        3. ask full name nextLine();
        4. ask zipcode nextInt();
        5. ask Country name nextLine();
        6. ask salary nextDouble();
        7. ask Company name nextLine();

         */
    }
}
