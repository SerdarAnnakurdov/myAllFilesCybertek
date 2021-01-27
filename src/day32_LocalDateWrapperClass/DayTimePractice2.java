package day32_LocalDateWrapperClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayTimePractice2 {
    public static void main(String[] args) {



        LocalDate DofB = LocalDate.of(1992,9,8);
        // 10 years ago :
        int age1 = LocalDate.now().minusYears(10).getYear()-DofB.getYear();
        //                   2020 - 10 = 2010 ..
        System.out.println("10 years ago you was : "+age1+" years old");

        System.out.println("=======================================");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM /dd/yyyy/ EEEE");

        LocalDate dateOfBirth = LocalDate.of(2010,8,17);
        int currentAge = LocalDate.now().getYear()-dateOfBirth.getYear();
        if(currentAge>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            LocalDate eligible = LocalDate.of(LocalDate.now().plusYears(21-currentAge).getYear(),DofB.getMonthValue(), dateOfBirth.getDayOfMonth());
            System.err.println("You will be eligible to buy alcohol on: "+eligible.format(df));
        }



    }
}
