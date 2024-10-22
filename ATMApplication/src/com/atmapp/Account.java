package com.atmapp;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private String userId;
    private String pin;
    private double balance;
    private List<Transaction> transactionHistory;

    public Account(String userId, String pin, double initialBalance) {
        this.userId = userId;
        this.pin = pin;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public boolean validatePin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add(new Transaction("Deposit", amount));
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactionHistory.add(new Transaction("Withdraw", amount));
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void addTransaction(String type, double amount) {
        transactionHistory.add(new Transaction(type, amount));
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void transfer(Account targetAccount, double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            targetAccount.balance += amount;
            transactionHistory.add(new Transaction("Transfer to " + targetAccount.getUserId(), amount));
            targetAccount.addTransaction("Transfer from " + this.getUserId(), amount);
        } else {
            System.out.println("Insufficient balance for transfer!");
        }
    }
}
