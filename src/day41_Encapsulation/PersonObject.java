package day41_Encapsulation;

import java.time.LocalDate;

public class PersonObject {
    public static void main(String[] args) {


        Person p1 = new Person("Jimmy",19,'M', LocalDate.of(2001,11,11));

        p1.setName("Breanna");





       Person p2 = new Person("Breanna",11,'F',LocalDate.of(2011,22,11));





    }
}
