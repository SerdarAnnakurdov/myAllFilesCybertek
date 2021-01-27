package day14_Switch_Recap;

public class salaryCalculare {
    public static void main(String[] args) {
        int hourlyRate = 60;
        int weeklyHours = 60;
        int numberOfWeeks = 52;
        int salary = 0;
        if (hourlyRate > 0) {
            if (weeklyHours > 1 && weeklyHours < 65) {
                if (numberOfWeeks > 1 && numberOfWeeks <= 52) {
                    salary = hourlyRate * weeklyHours * numberOfWeeks;
                } else {
                    System.err.println("Number of weeks cannot be less than 1 or grater than 52");
                }
            } else {
                System.err.println("Weekly Hours cannot be less than 1 or grater than 65");
            }         //err - means red letters which says what is error in print
        } else {

            System.err.println("Hourly Rate can not be Negative or lees than  0");
        }           // err - means tells you what is where gives you error in red color ...

        System.out.println("Your salary is : " + salary + "$");
    }
}
