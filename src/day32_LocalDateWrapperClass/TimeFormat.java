package day32_LocalDateWrapperClass;

import sun.jvm.hotspot.code.LocationValue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {

    /*
LocalDate:
    year; yyyy
    month; MM (number) , MMM (three letters of month), MMM(full name)
    days; dd
    name of a day: E(three letters ) , EEEE (full name)

   LocalTime: hours : hh
   minutes : mm
   seconds : ss
   am/pm : a
 */
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE");

        LocalDate today = LocalDate.now(); // 2020-11-23
        System.out.println(today);

        System.out.println(today.format(df));


        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();
        System.out.println(now.format(tf));

        LocalTime t1 = LocalTime.of(23, 35);
        System.out.println(t1);
        System.out.println(t1.format(tf));

        //Monday Mon, 11:40, AM, November/23/2020

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm, a, MMMM/dd/yyyy");
        LocalDateTime dt1 = LocalDateTime.of(2020, 11, 23, 11, 40);
        System.out.println(dt1.format(df));


        LocalDate tomorrow = LocalDate.of(2020,11,24);
        System.out.println(tomorrow);
        System.out.println(tomorrow.format(df));

        boolean r1 = today.isBefore(tomorrow);  // true
        boolean r2 = today.isAfter(tomorrow); // false

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("=======================================");

        // calculate the age   // 2-2--11-23    2020
        int currentYear = LocalDate.now().getYear();
        LocalDate DofB = LocalDate.of(2000,5,19);
        int age = currentYear - DofB.getYear();
        System.out.println(age);


        System.out.println(DofB.plusDays(10));

        LocalDate rightNow = LocalDate.now();
        LocalDate holidayBreak = rightNow.plusDays(2);
        System.out.println(holidayBreak);



        LocalTime time = LocalTime.now();
        LocalTime lunchBreak = time.plusMinutes(15);
        System.out.println(lunchBreak.format(tf));


        System.out.println("================================");

        LocalTime classStars = LocalTime.of(10,0);
        LocalTime firstBreak = classStars.plusMinutes(45);
        System.out.println(firstBreak);

        LocalTime secondBreak = firstBreak.plusMinutes(15).plusMinutes(45);
        System.out.println(secondBreak);
        System.out.println("=================================");

        LocalTime thirdBreak = secondBreak.plusMinutes(15).plusMinutes(45);
        System.out.println(thirdBreak);


        LocalTime afternoonClass = thirdBreak.plusMinutes(75);
        System.out.println(afternoonClass.format(tf));





    }
}
