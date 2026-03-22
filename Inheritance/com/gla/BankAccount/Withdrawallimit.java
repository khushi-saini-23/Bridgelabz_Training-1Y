package com.gla.BankAccount;

public class Withdrawallimit extends BankAccount{
    double Withdrawallimit;
    public Withdrawallimit(int accountNumber,double balance,double withdrawalLimit){
        super(accountNumber, balance);
        this.Withdrawallimit=withdrawalLimit;
    }
    public void DisplayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
    public void Withdrawallimit() {
        System.out.println("Withdrawal Limit: " +Withdrawallimit);
    }
}
