package day05_Concatenation;

public class EmployeeInfo {
    public static void main(String[] args) {

    String firstName = "Serdar";
    String lastName = "Annakurdow";
    String fullName = firstName+" "+lastName;
    char gender = 'M'; // '' code - is for single character
        int age =35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        double salary = 10000;
        boolean isFullTime = true;
        boolean isMarried = false;

        System.out.println("Employees full name is : "+fullName);
        System.out.println(fullName+" gender is :"+gender);
        System.out.print(fullName);
        System.out.println(" age is : "+age+" years old");
        System.out.println(fullName+" works at : "+companyName);
        System.out.println(fullName+" Job Title is : "+jobTitle);
        System.out.println(fullName+" salary is : $"+salary);
        System.out.println(fullName+" is full time employee : "+isFullTime+"");
        System.out.println(fullName+" is married : "+isMarried);













    }

}
