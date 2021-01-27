package day45_Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        //StringIndexOutOfBound
        String str = "Cybertek";

        try{
            System.out.println(str.substring(200,300));
            System.out.println("Try block");

        }catch (StringIndexOutOfBoundsException e){
            //System.out.println(e.getMessage());
            //e.printStackTrace();
            System.out.println("Catch block");

        }

        //Thread.sleep();
        try{
            Thread.sleep(5000);
            //System.out.println("Try block");
        }catch (InterruptedException e){
            //System.out.println("Catch block");
        }



        System.out.println("Completed");


        try{
            System.out.println(100/0);
        }catch (RuntimeException e){
            System.out.println("Unchecked exception is occured "+e.getMessage());
            e.printStackTrace();
        }



    }
}
