package com.gla.BankAccount;

public class BankAccount {
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void displayDetails(){
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Balance :"+balance);
    }
    public void displayAccountType() {
        System.out.println("General Bank Account");
    }
}
