package day35_CustomClass;

public class capitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();

        account1.setInfo("Saidullo","1234567890");

        account1.getInfo();

        account1.deposit(100);

        account1.showBalance();

        account1.withdraw(80);

        account1.showBalance();

        account1.withdraw(20);
        account1.showBalance();

        account1.deposit(1000);
        account1.showBalance();


        System.out.println("================aaaaaaaaaaaa=============================");



        BankAccount account2 = new BankAccount();

        account2.setInfo("Walid","233333434");

        account2.deposit(200);
        account2.deposit(3000);

        account2.showBalance();















    }
}
