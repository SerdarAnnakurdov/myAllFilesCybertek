package day47_Abstraction.EmployeeTask;

public class AppleInc {
    public static void main(String[] args) {

        // Person person = new Person("Person",1,'M');  --->> not possible to create an obj abstr classes

        //Employee employee = new Employee("Person",12,'F',"A12","123",23); --->> same thing abst class
        // only sub classes able to create an obj

        Tester tester = new Tester("Mini",23,'F',"SDET","D123",76_000);

        Developer developer = new Developer("Mikki",25,'F',"SDET","D123",76_000);

        UberDriver uberDriver = new UberDriver("Ker",56,'M',"driver","D123",100_000);

        tester.work();
        tester.sleep();

        developer.work();
        developer.sleep();

        uberDriver.work();
        uberDriver.sleep();







    }
}
