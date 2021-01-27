package day13_SwitchStatement;

public class SwitchStatement_Practice03 {
    public static void main(String[] args) {
       String browser = "cybertek";
       String selectedBrowser="";


       switch (browser){
           case "chrome":
               selectedBrowser="CHROME BR";
               break;
           case "firefox":
               selectedBrowser="FIREFOX BR";
               break;
           case "opear":
               selectedBrowser="OPERA BR";
               break;
           case "safari":
               selectedBrowser="SAFARI BR";
               break;
           case "edge":
               selectedBrowser="EDGE BR";
               break;
           case "ie":
               selectedBrowser="INTERNET EXPLORER";
               break;
           case "cybertek":
               selectedBrowser="CYBERTEK BROWSER"; // we adding here any more excepted browsers like a CASE
               break;                               // other wise they won't found as able browsers ...

           default:selectedBrowser="INVALID BROWSER ";
       }

        System.out.println(selectedBrowser);










    }
}
