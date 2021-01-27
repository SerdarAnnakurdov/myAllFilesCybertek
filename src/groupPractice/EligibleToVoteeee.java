package groupPractice;

public class EligibleToVoteeee {
    public static void main(String[] args) {
        int age = 19;
        String citizen = "USA";
        String citizen2 = "CANADA";
        int creditHistory = 50;


        if (citizen == "USA" || citizen2 == "TURKMENISTAN") {
            if (creditHistory >= 650) {
                System.out.println("You can vote");
            } else {
                System.err.println("You have to have at least 650 credit score");
            }

        } else {
            System.err.println("You cannot vote");
        }

        System.out.println("====================================");

        int num = 22;
        String dayOfTheWeek = "";

        if (num >= 1 && num <= 7) {
            if (num == 1) {
                dayOfTheWeek = "Monday";
            } else if (num == 2) {
                dayOfTheWeek = "Tuesday";
            } else if (num == 3) {
                dayOfTheWeek = "Wednesday";
            } else if (num == 4) {
                dayOfTheWeek = "Thursday";
            } else if (num == 5) {
                dayOfTheWeek = "Friday";
            } else if (num == 6) {
                dayOfTheWeek = "Saturday";
            } else if (num == 7) {
                dayOfTheWeek = "Sunday";
            }

        } else {
            System.out.println("There isss no more days a week");
        }
        System.out.println(dayOfTheWeek);


        System.out.println("----------------------------------");

        int hourlyRate = 85;
        int weeklyHours = 48;
        int numberOfWeeks = 52;
        int salary = 0;


        if(hourlyRate>0){
            if(weeklyHours>1&&weeklyHours<65){
                if(numberOfWeeks>=1 && numberOfWeeks<=52){
                    salary = hourlyRate*weeklyHours*numberOfWeeks;
                }else{
                    System.out.println("Number of weeks cannot be less than 1 grater than 52");
                }
            }else{
                System.out.println("Weekly hours cannot be less than 1 or grater than 65");
            }
        }else{
            System.out.println("Hourly rate cannot be less than 0");

        }
        System.out.println("Your salary is :"+salary+"$");


        System.out.println("=====================");







    }
}
