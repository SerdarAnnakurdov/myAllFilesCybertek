package day35_CustomClass;

import java.time.LocalDate;

public class BankAccount {

    public String accountName;
    public String accountNumber;
    public double accountBalance = 0;


    public void setInfo(String accName,String accNumber){
        accountName = accName;
        accountNumber = accNumber;
    }

    public void getInfo(){
        System.out.println("============================================");
        System.out.println("Date: "+ LocalDate.now());
        System.out.println("Account Name: "+accountName);
        System.out.println("Account number: "+accountNumber);
        System.out.println("Available Balance: "+accountBalance);
        System.out.println("============================================");
    }

    public void deposit(double amount){
        accountBalance+=amount;

    }

    public void withdraw(double amount){
        accountBalance-=amount;
    }

    public void showBalance(){
        System.out.println("As of Today "+LocalDate.now()+" "+accountName+" "+" your available balance is:  $"+accountBalance);
    }







}
