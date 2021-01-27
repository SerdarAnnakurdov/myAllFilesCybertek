package day35_CustomClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class WarmpUpTask {
    public static void main(String[] args) {

        String[] str = {"Turkmenistan","Kazagystan","Ozbekistan","Iran","Yemen","Gyrgyzystan"};

        ArrayList<String> countryNames = new ArrayList<>(Arrays.asList(str));

        countryNames.removeIf(p->p.length()-1 >10);

        System.out.println(countryNames);

        System.out.println("==============================================");

        LocalDate[] arr1 = {
                LocalDate.of(2010, 11, 23),
                LocalDate.of(2012, 11, 23),
                LocalDate.of(2013, 11, 23),
                LocalDate.of(2014, 11, 23),
                LocalDate.of(2015, 11, 23),
                LocalDate.of(2016, 11, 23),
                LocalDate.of(2017, 11, 23),
                LocalDate.of(2018, 11, 23),
                LocalDate.of(2019, 11, 23),
                LocalDate.of(2020, 11, 23),
        };

        LocalDate d1 = LocalDate.of(2016,8,15);
        ArrayList<LocalDate> dates = new ArrayList<>(Arrays.asList(arr1));
        dates.removeIf(p->p.isBefore(d1));

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/YYYY, EEE");

        for(LocalDate eachDate :dates){
            System.out.println(eachDate.format(df));
        }


        System.out.println(dates);






    }
}
