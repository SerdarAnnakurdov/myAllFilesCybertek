package Office_Hours.Practice_10_06_2021;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

public class ExceptionHandling_TryCatch {
    public static void main(String[] args) {
/*
        try {
            throw new NoSuchElementException("Element not found");
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Test1 ended");

        System.out.println("Cybertek".charAt(900));
        System.out.println("Serdar".charAt(922));
*/

        try {
            System.out.println("Cybertek".charAt(400));
        }catch (RuntimeException e){
            e.printStackTrace();
            e.getMessage();
        }


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("test3 ended");
        }


        try{
            throw new FileNotFoundException();
        }catch (FileNotFoundException e){
        e.printStackTrace();


    }


}}
