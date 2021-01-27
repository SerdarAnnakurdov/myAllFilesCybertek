package day45_Exceptions;

public class Driver {
    public static void main(String[] args) {

        String browserName = "CHROME";

        switch (browserName.toLowerCase()) {
            case "chrome":
                System.out.println("Chrome is selected");
                break;
            case "firefox":
                System.out.println("FireFox is selected");
                break;
            case "safari":
                System.out.println("Safari is selected");
                break;
            case "opera":
                System.out.println("Opera is selected");
                break;
            default:
              throw new RuntimeException("No such a browser named "+browserName);
        }

        System.out.println("=============================================");


        int n1 = 1;
        int n2 = 1;

        if(n1>n2){
            System.out.println(n1+" is greater");
        }else if(n2>n1){
            System.out.println(n2+" is greater");
        }else{
            throw  new RuntimeException("I thinks they are equal ");
        }

        System.out.println("================================");



    }
}
