package day45_Exceptions;

import day42_Inheritance.AnimalTask.Cat;

import java.io.IOException;
import java.util.NoSuchElementException;

public class MultiCatchBlock {
    public static void main(String[] args) {


        try {
            System.out.println(25 / 0);
        } catch (NoSuchElementException e) {
            System.out.println("no such element excepstion");
        } catch (ClassCastException e) {
            System.out.println("ClassCastExc");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticExcp");
        } catch (NullPointerException e) {
            System.out.println("NullPoint");
        } catch (RuntimeException e) {
            System.out.println("Runtime exception");
        }

        System.out.println("======================================================");

/*
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/

        System.out.println("====================================================");


        String[] names = {"Walid", "Serdar", "kaka", "Kesha", "Myrad"};

        try {
            names[10] = "Muhtar"; // ArrayIndexOutOfBound
        }catch (IllegalArgumentException e){
            System.out.println("Illegal Argument exc");
        }catch (NoSuchElementException e){
            System.out.println("No such Element exc");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBound ");
        }catch (RuntimeException e){
            System.out.println("Run time exc");
        }catch (Exception e){
            System.out.println("Exception");
        }



    }
}
