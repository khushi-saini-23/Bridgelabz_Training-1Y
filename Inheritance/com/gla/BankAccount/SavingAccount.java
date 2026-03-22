package com.gla.BankAccount;

public class SavingAccount extends BankAccount{
    double interestRate;
    public SavingAccount(int accountNumber,double balance,double interestRate){
        super(accountNumber,balance);
        this.interestRate=interestRate;
    }
    @Override
    public void displayAccountType() {
        System.out.println("account Type: savings account");
    }
    public void interestRate() {
        System.out.println("interest rate: " +interestRate);
    }
}
