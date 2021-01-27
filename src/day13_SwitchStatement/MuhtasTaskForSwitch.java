package day13_SwitchStatement;

public class MuhtasTaskForSwitch {
    public static void main(String[] args) {
        String browserName = "chrome";
        String albeBrowser = "";

        switch (browserName){
            case "chrome":
                albeBrowser="CHROME BR";
                break;
            case "firefox":
                albeBrowser="FIREFOX BR";
                break;
            case "opera":
                albeBrowser="OPERA BR";
                break;
            case "safari":
                albeBrowser="SAFARI";
                break;
            case "edge":
                albeBrowser="EDGE BR";
                break;
            case "ie":
                albeBrowser="INTERNET EXPLORER BR";
                break;
            default:
                albeBrowser="THERE IS NO SUCH A BROWSERS";
        }
        System.out.println(albeBrowser);















    }
}
