package com.samsicker.OOP.OOP1Inheritance.BankAccount;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountBalance(1000);
        bankAccount.depositFunds(500);
        double balance = bankAccount.withdrawFunds(2000);
        if(balance == -1){
            System.out.println("You can't withdraw more money than is in your account");
        } else {
            System.out.println("Your new Account Balance is: " + bankAccount.withdrawFunds(700));
        }
    }
}
