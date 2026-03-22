package com.gla.BankAccount;

public class Runner {
    public static void main(String[] args){
        System.out.println("Bank Account");
        BankAccount b1 = new BankAccount(891,340000);
        b1.displayDetails();
        b1.displayAccountType();

        System.out.println("***********************************************");
        System.out.println("Saving Account");
        SavingAccount s1 = new SavingAccount(192,900000,3.5);
        s1.displayDetails();
        s1.displayAccountType();
        s1.interestRate();

        System.out.println("*************************************************");
        System.out.println("Withdrawal Limit Account");
        Withdrawallimit w1 = new Withdrawallimit(23,2344599,10000);
        w1.displayDetails();
        w1.DisplayAccountType();
        w1.Withdrawallimit();

        System.out.println("***************************************************");
        System.out.println("Fixed Deposit Account");
        FixedDeposit f1 = new FixedDeposit(899,8900000,12);
        f1.displayDetails();
        f1.displayAccountType();
        f1.duration();
    }
}
