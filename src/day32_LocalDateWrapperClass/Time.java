package day32_LocalDateWrapperClass;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class Time {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.of(23,50,55,1000);
        System.out.println(t1);

        LocalTime now =  LocalTime.now();
        System.out.println(now);

        System.out.println("=======================================");
        LocalDateTime t2 = LocalDateTime.of(2020,11,23,11,50);
        System.out.println(t2);

        LocalDateTime t3 = LocalDateTime.now();
        System.out.println(t3);



    }
}
