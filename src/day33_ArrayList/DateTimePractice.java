package day33_ArrayList;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DateTimePractice {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM/dd, EEE");
        LocalDate[] days = new LocalDate[10];

        for (int i = 0; i < days.length; i++) {
            days[i] = LocalDate.now().plusDays(i + 1);
        }

        System.out.println(Arrays.toString(days));

        for (LocalDate eachDays : days) {
            System.out.println(eachDays.format(df));
        }

        System.out.println("===================================");

        String[] friends = {"Serdar", "Kici", "Uly", "Uzyn", "Vokk"};
        LocalDate[] dofB = {LocalDate.of(1991, 11, 10),
                LocalDate.of(1992, 11, 10),
                LocalDate.of(1993, 11, 10),
                LocalDate.of(1994, 11, 10),
                LocalDate.of(1995, 11, 10)};

        String nameOfOlder = friends[0];
        LocalDate older = dofB[0];

        String nameOfYoungest = friends[0];
        LocalDate younger = dofB[0];

        for (int i = 0; i < dofB.length; i++) {
            if (dofB[i].isBefore(older)) {
                older = dofB[i];
                nameOfOlder = friends[i];
            }
            if(dofB[i].isAfter(younger)){
                younger = dofB[i];
                nameOfYoungest = friends[i];
            }

        }
        System.out.println(nameOfOlder+": " + older);
        System.out.println(nameOfYoungest+": "+younger);


    }
}
