package com.atmapp;

import java.util.Scanner;

public class ATMService {
    private Account account;

    public ATMService(Account account) {
        this.account = account;
    }

    public void showTransactionHistory() {
        System.out.println("Transaction History:");
        for (Transaction transaction : account.getTransactionHistory()) {
            System.out.println(transaction);
        }
    }

    public void deposit(double amount) {
        account.deposit(amount);
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount > account.getBalance()) {
            System.out.println("Insufficient funds.");
        } else {
            account.withdraw(amount);
            System.out.println("Withdrawn: " + amount);
        }
    }

    public void transfer(Account targetAccount, double amount) {
        account.transfer(targetAccount, amount);
        System.out.println("Transferred: " + amount + " to " + targetAccount.getUserId());
    }

    public void quit() {
        System.out.println("Thank you for using the ATM. Goodbye!");
    }
}
