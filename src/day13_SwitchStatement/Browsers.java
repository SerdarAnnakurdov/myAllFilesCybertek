package day13_SwitchStatement;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "firefox";
        String selectetBrowser = "";

        boolean valid = browserName=="chrome" || browserName=="firefox" ||browserName=="opera" ||
                browserName=="safari"||browserName=="edge"||browserName=="ie";

        if(valid){
            if(browserName=="chrome"){
                selectetBrowser="CHROME BROWSER IS SELECTED";
            }else if(browserName=="firefox"){
                selectetBrowser="FIREFOX BROWSER IS SELECTED";
            }else if(browserName=="opera"){
                selectetBrowser="OPERA BR IS SELECTED";  ///    those all right output
            }else if(browserName=="safari"){
               selectetBrowser="SAFARI BR IS SELECTED";
            }else if(browserName=="edge"){
                selectetBrowser="EDGE BER IS SELECTED";
            }else if(browserName=="ie"){
                selectetBrowser="INTERNET EXPLORER IS SELECTED";
            }

        }else{
            System.out.println("no such a browser"); // those all opposite output
        }
        System.out.println(selectetBrowser);













    }
}
