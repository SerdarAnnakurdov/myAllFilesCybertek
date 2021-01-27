package day14_Switch_Recap;

public class daysInMonths2 {
    public static void main(String[] args) {
        int year = 2021;
        String month = "Feb";
        String result = "";

        switch (month) {             //SWITCH DOES NOT ACCEPT LONG > FLOAT > DOUBLE > BOOLEAN !!!!!!
            case "Feb":
                result = (year% 4 == 0) ? "29 days" : "28 days";
                break;
            case "Aprel":
            case "Jun":
            case "Sep":
            case "Nove":
                result = "30 days"; // this is OR logic in switch statement
                break;
            case "Jan":
            case "Mar":
            case "May":
            case"Jul":
            case "Aug":
            case "Oct":
            case "Dec": result = "31 days";
            break;
            default: result = "Invalid";
        }
        System.out.println(result);


    }
}
