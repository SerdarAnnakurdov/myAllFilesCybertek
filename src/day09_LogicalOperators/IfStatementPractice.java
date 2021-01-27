package day09_LogicalOperators;

public class IfStatementPractice {
    public static void main(String[] args) {
        int year = 2020;
        boolean isPandemic = year == 2020;

        if(isPandemic){
            System.out.println("wearm mask ");
            System.out.println("wash hands");
            System.out.println("buy toilet papers");
        }
        if(!isPandemic){
            System.out.println("be free");
        }


        System.out.println("===================================");

        String name = "Serdar";
        int age = 19;
        boolean isUScitizen = false;

        boolean eligible = isUScitizen && age >= 18;
        //                     false && true => false
        if(eligible){
            System.out.println(name+" is eligible to vote");
        }
        if(!eligible){
            System.out.println(name+" is not eligible to vote");

        }








    }
}
