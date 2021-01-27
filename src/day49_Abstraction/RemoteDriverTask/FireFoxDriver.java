package day49_Abstraction.RemoteDriverTask;

public class FireFoxDriver extends RemoteDriver{
    @Override
    public void Executer(String script) {
        System.out.println("Script "+script+" is executed on FireFox");
    }

    @Override
    public void TakeScreenShot(String name) {
        System.out.println("Taking screenshot on FireFox");
    }

    @Override
    public void get(String URL) {
        System.out.println("Navigating to "+URL+" on FireFox");
    }

    @Override
    public void close() {
        System.out.println("Closing FireFox browser");
    }

    @Override
    public void quit() {
        System.out.println("Quiting FireFox");
    }
}
