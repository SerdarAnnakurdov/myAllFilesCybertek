package groupPractice;

public class BahramTasks1 {
    public static void main(String[] args) {
        String firsName = "SERDAR";
        String lastName = " ANNAKURDOV";

        String fullName = firsName.concat(lastName);
        System.out.println("Your full name is : "+fullName);

        System.out.println("============================");
        int day = 3;
        String dayOfWeek = "";

        if(day==1){
            dayOfWeek="Monday";
        }else if(day==2){
            dayOfWeek="Tuesday";
        }else if(day==3){
            dayOfWeek="Wednesday";
        }else if(day==4){
            dayOfWeek="Thursday";
        }else if(day==5){
            dayOfWeek="Friday";
        }else if(day==6){
            dayOfWeek="Saturday";
        }else if(day==7){
            dayOfWeek="Sunday";
        }else{
            dayOfWeek="There is no more days a week";
        }
        System.out.println("Today is : "+dayOfWeek);
        System.out.println("--------------------------");

        int year = 2;
        String monthOfyear = "";

        switch (year){
            case 1 :
                monthOfyear="Jan";
                break;
            case 2 :
                monthOfyear="Feb";
                break;
            case 3:
                monthOfyear="Mar";
                break;
        }
        System.out.println(monthOfyear);









    }
}
