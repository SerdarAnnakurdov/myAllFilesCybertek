package day11_MultiBranchIf;

public class DaysInMonth2Ternary {
    public static void main(String[] args) {
        int month = 11; // 1 to 12
        boolean has28days = month == 2;
        boolean has30days = month == 4 || month == 6 || month ==9 || month == 11;
        boolean has31days = !has28days && !has30days;
        int days = 0;



        if(has28days){

            days = 28;
        }else if(has30days){

            days = 30;
        }else{
            days = 31;   // you cant add this statement without variable


        }
        System.out.println(days+" days  ");

        System.out.println("======================================");
        // belong Ternory KIND

        int days2 = (has28days)? 28 :(has30days)?30 : 31;

        System.out.println("First month has : "+days2+" days ");










    }
}
