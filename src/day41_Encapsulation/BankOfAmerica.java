package day41_Encapsulation;

public class BankOfAmerica {
    public static void main(String[] args) {

        BankAccount bank1 = new BankAccount("Serdar", "Annakurdov", 123456789);

        System.out.println(bank1.getAccountHolder());
        System.out.println(bank1.getBalance() );

        bank1.deposit(-200);
        bank1.availableBalance();

        System.out.println("============================================");

        bank1.deposit(100);
        bank1.availableBalance();


        System.out.println(BankAccount.bankName);


    }
}
