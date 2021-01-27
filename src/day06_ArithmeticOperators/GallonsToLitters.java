package day06_ArithmeticOperators;

public class GallonsToLitters {
    public static void main(String[] args) {
        double gallon =120.5;
        double litters = gallon * 3.78541;
        System.out.println(gallon+" gallons equal to : "+litters+ " L");

        boolean exceed300liters = litters <300;
        System.out.println(gallon+" gallons exceed 300 liters :"+exceed300liters);


        int lira = 1000;
        double liraToUsd = lira * 0.13;
        System.out.println(lira+" lira will be $ "+liraToUsd);




    }
}
