package day41_Encapsulation;

import java.time.LocalDate;

public class Person {
    private String name;
    private  int age;
    private final char gender;    // final variable cannot have setter ;;
    private final LocalDate BOD;

    public Person(String name, int age, char gender, LocalDate BOD) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.BOD = BOD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
