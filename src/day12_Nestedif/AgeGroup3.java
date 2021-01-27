package day12_Nestedif;

public class AgeGroup3 {
    public static void main(String[] args) {
        int age = 83;


        String ageGroup = (age<=2)?"Infant" : (age<=5)?"Todler":(age<=9)?"Kid":
                (age<=12)?"Pre-Teen":(age<=17)?"Teenager":(age<=20)?"Young Adult":
                        (age<=39)?"Adult":(age<=49)?"Young Middle-aged Adult":
                                (age<=54)?"Middle-Aged Adult":(age<=64)?"Very Young Senior Cit":
                                        (age<=74)?"Young Senior Citizen":
                                                (age<=84)?"Senior Citizen":"Old Senior Citizen";
        System.out.println(ageGroup);















    }
}
