package day43_Inheritance.person_Task;

public class AppleInc {
    public static void main(String[] args) { //Apple Has a tester

        Tester tester1 = new Tester("Mini",23,'F',23,"SDET","a123");
        tester1.eat();
        tester1.sleep();
        tester1.work();
        System.out.println("Salary "+tester1.calcSalary());
        tester1.testing();
        System.out.println(tester1);

        System.out.println("==================================================================================");

        Developer developer1 = new Developer("Mini",23,'F',45,"SDET","a123");
        developer1.eat();
        developer1.sleep();
        developer1.work();
        developer1.coding();
        System.out.println("Salary: "+developer1.calcSalary());
        System.out.println(developer1);








    }
}
