package day12_Nestedif;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 10;
        String ageGroups= "";
        if(age>=1&&age<=2){// this lane becomes false when age >=3
            ageGroups = "Infant";
        }else if(age>=3&&age<=5){
            ageGroups = "Toodler";
        }else if(age>=9&&age<=6){
            ageGroups = "Kid";
        }else if(age>=10&&age<=12){
            ageGroups = "Pre-Teen";
        }









    }
}
/*
2. write a program that can define the age groups of a person
                 age groups are:
                        infant (< 1 year)
                        Toddler (3 - 5),
                        Kid (6 - 9),
                        Pre-Teen (10 - 12),
                        Teenager (13 - 17),
                        Young Adult (18 - 20),
                        Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),
                        Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),
                        Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
 */