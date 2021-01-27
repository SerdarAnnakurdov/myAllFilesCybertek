package day41_Encapsulation;

public class Data {

    public static String publicVariable = "A";
    protected static String protectedVariable = "D";

    private static String privatVariable = "B";
    static String defaultVariable = "C"; // default access modify


    private Data(){

    }


    public static void publicMethod(){
        System.out.println("public Method");
    }

    private static void privateMethod(){
        System.out.println("private method");
    }

   static void defaultMethod(){
        System.out.println("default method");
    }



}
