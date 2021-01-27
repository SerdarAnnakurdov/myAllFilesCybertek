package day45_Exceptions;

import day43_Inheritance.CarTask.Car;
import library.BrowserUtility;

public class Throw_VS_TryCatch {
    public static void main(String[] args) {

        method1();
        System.out.println("Try & catch");

        //method2();
        //Thread.sleep(3000);


        sleep(3);
        System.out.println("Task completed");


        BrowserUtility.sleep(1);









    }


    public static void method1() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void method2() throws InterruptedException {
        Thread.sleep(1000);
    }
    public static void sleep(long seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
