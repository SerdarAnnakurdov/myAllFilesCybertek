package day18_Strings;

import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an apple product name: ");
        String product = scan.nextLine();//mAc   BoOk
        product = product.replace(" ", "").toLowerCase(); // macbook

        switch (product) {
            case "macbook":
                System.out.println("Which model of MacBook Would like?");
                String model = scan.nextLine();
                if (model.equalsIgnoreCase("air")) {
                    System.out.println("MacBook Air is $2400");
                } else if (model.equalsIgnoreCase("pro")) {
                    System.out.println("MacBook Pro is $2500");
                } else {
                    System.err.println("Invalid model or MacBook");
                }
                break;

            case "iphone":
                System.out.println("Which model of IPhone would you like? ");
                String model2 = scan.nextLine().toLowerCase();
                if (model2.equals("12")) {
                    System.out.println("IPhone 12 is $1000");
                } else if (model2.equals("11")) {
                    System.out.println("IPhone 11 is $900");
                } else if (model2.equals("10")) {
                    System.out.println("IPhone 10 is $800");
                } else if (model2.equals("8")) {
                    System.out.println("IPhone 8 is $700");
                } else {
                    System.err.println("Invalid model of IPhone");
                }
                break;


            case "ipad":
                System.out.println("Which model of Ipad would like ?");
                String model3 = scan.nextLine().toLowerCase();
                switch (model3) {
                    case "air":
                        System.out.println("Ipad air is $500");
                        break;
                    case "pro":
                        System.out.println("Ipad pro is $400");
                        break;
                    case "mini":
                        System.out.println("Ipad mini is $300");
                        break;

                    default:
                        System.err.println("Invalid model of ipad");
                }


            default:
                System.err.println("Invalid product name");
        }


    }
}
/*

1. enter product -->> invalid invalid entry ..

MacBook :
air: 2400
pro: 2500

IPhone :
12: 1000
11: 900
9: 800
8: 700
Ipad:
air: 500
mini: 400
pro: 300

 */