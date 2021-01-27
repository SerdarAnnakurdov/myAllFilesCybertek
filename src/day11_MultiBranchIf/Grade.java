package day11_MultiBranchIf;

public class Grade {
    public static void main(String[] args) {
        double score = 90; // 0 - 100

        String grade1 = "";

        if(score >= 90){ // becomes  false when score < 90
            grade1 = "A";
        }else if(score >= 80 && score < 90){ // becomes false when score < 80
            grade1 = "B";
        }else if(score >= 70 && score < 80){// becomes false when score < 70
            grade1 = "C";
        }else if(score >= 60 && score < 70){
            grade1 = "D";
        }else{
            grade1 = "F";
        }
        System.out.println("Your grade is : "+grade1);

        System.out.println("-----------------------------------------------------------");

        char grade = ' ';

        if(score >= 90){ // becomes false when score < 90
            grade = 'A';
        }else if(score >= 80 ){//becomes false when score < 80
            grade = 'B';
        }else if(score >= 70){// becomes false when score < 70
            grade = 'C';
        }else if(score >= 60){// becomes false when score < 60
            grade = 'D';
        }else{
            grade = 'F';
        }
        System.out.println("Your Grade is : "+grade);

        System.out.println("-------------------------------------------------");


        // write the program that can print out the name of the day based on the number


        int number = 7;
        String day = " ";

        if(number == 1){
            day  = " Monday";
        }else if(number == 2){
            day  = " Tuesday";
        }else if(number == 3){
            day  = " Wednesday";
        }else if(number == 4){
            day  = " Thursday";
        }else if(number == 5){
            day  = " Friday";
        }else if(number == 6){
            day  = " Saturday";
        }else{  // !!!!!!! ELSE MEANs this condition ends at the ELSE
            day  = " Sunday";
        }
        System.out.println("Today is :"+day);

        System.out.println("============================================");

        int number1 = 12;
        String month = "";

        if(number1 == 1){
            month = "January";
        }else if(number1 == 2){
            month = "February";
        }else if(number1 == 3){
            month = "March";
        }else if(number1 == 4){
            month = "Aprel";
        }else if(number1 == 5){
            month = "May";
        }else if(number1 == 6){
            month = "June";
        }else if(number1 == 7){
            month = "July";
        }else if(number1 == 8){
            month = "August";
        }else if(number1 == 9){
            month = "September";
        }else if(number1 == 10){
            month = "October";
        }else if(number1 == 11){
            month = "November";
        }else{
            month = "December";
        }
        System.out.println("This month is : "+month);

























    }
}
