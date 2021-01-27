package day13_SwitchStatement;

public class DaysinMonth {
    public static void main(String[] args) {


















































        int year = 2013;
        int month = 11;

        boolean has28or29days = month==2;
        boolean has30days = month==4 || month==6 || month==9 || month==11;



        String result = "";

        if(month >0 && month < 13){
            if(has28or29days){
                if(year%4==0){
                    result = "29 days";
                }else{
                    result = "28 days ";
                }
            }else if(has30days){
                result = "30 days";
            }
        }else{
            result = "Invalid month";
        }















    }
}
