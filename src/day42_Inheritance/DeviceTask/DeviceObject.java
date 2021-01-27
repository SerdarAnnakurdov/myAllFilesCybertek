package day42_Inheritance.DeviceTask;

import Office_Hours.Practice_11_04_2020.FrequencyOfChar;

import java.util.ArrayList;
import java.util.Arrays;

public class DeviceObject {
    public static void main(String[] args) {


        TV tv = new TV("Samsung","LX32",499.99);
        System.out.println(tv);
        tv.channelUp();
        tv.channelDown();
        tv.turnOf();
        tv.turnOn();




        System.out.println("=======================================");


        Phone phone = new Phone("iPhone","12 Pro Max",1200);
        phone.turnOn();
        phone.turnOf();
        phone.texting(534503);
        phone.call(534503);










/*
Task:
    Person
        name, age, gender
        setInfo, eat(), sleep()
    Employee
        name, age, gender, hourlyRate, jobTitle, ID
        setInfo, eat(), sleep(), work()
    Tester:
        name, age, gender, hourlyRate, jobTitle, ID
        Constructor
        eat(), sleep(), work(), testing(),...
    Developer:
        name, age, gender, hourlyRate, jobTitle, ID
        Constructor
        eat(), sleep(), work(), code()...

 */






    }
}
