package day16_Scanner;

import java.util.Scanner;

public class Scanner_Browsers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Browser type: ");
        String browser = input.nextLine();
        switch (browser) {

            case "chrome":
                System.out.println("Chrome is opening");
                break;
            case "firefox":
                System.out.println("FireFox is opening");
                break;
            case "opera":
                System.out.println("Opera is opening ");
                break;
            case "safari":
                System.out.println("Safari is opening");
                break;
            case "ie":
                System.out.println("InternetExplorer is opening");
                break;
            default:
                System.out.println(" isn't valid browser");

        }


    }
}
