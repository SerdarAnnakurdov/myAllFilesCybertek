package day39_StaticBlock;

import day37_CustomClass.Employee;

public class StaticBlocks {

    public static String company;
    public static Employee employee1;
    public int a;
    public static int b;
    public static boolean isEmployeed;

    static {
        company = "Capital One";

        isEmployeed = true;
        employee1 = new Employee();
        employee1.setInfo("John", company, "SDET", "A123", "Male", 40, 44);

        // a = 100;
        b = 200;
        System.out.println("Static Block");

    }


    //exelSheet
    /*
    public static void main(String[] args) {
        company = "Capital One";
        isEmployeed = true;
        employee1 = new Employee();
        employee1.setInfo("John", company, "SDET", "A123", "Male", 40, 44);
        b = 200;
        isEmployeed = true;

        System.out.println(company);
        System.out.println(employee1);
        System.out.println(b);
        System.out.println(isEmployeed);

    }
    */


}
