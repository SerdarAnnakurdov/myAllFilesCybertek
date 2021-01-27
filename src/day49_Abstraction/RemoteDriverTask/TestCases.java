package day49_Abstraction.RemoteDriverTask;

public class TestCases {
    public static void main(String[] args) {

        ChromeDriver Driver = new ChromeDriver();
        Driver.get("https://www.google.com");
        Driver.TakeScreenShot("pictures");
        Driver.close();

        System.out.println("==============================================================");

        FireFoxDriver driver2 = new FireFoxDriver();
        driver2.get("https://www.youtube.com");
        driver2.TakeScreenShot("pictures");
        driver2.close();

        System.out.println("==============================================================");


        WebDriver driver3 = new ChromeDriver();





    }
}
