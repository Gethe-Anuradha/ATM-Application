package com.atmapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATM {
    private Map<String, Account> accounts = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public ATM() {
        // Adding demo accounts (userId, pin, balance)
        accounts.put("user1", new Account("user1", "1234", 1000));
        accounts.put("user2", new Account("user2", "5678", 2000));
    }

    public Account login() {
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        Account account = accounts.get(userId);
        if (account != null && account.validatePin(pin)) {
            System.out.println("Login successful!");
            return account;
        } else {
            System.out.println("Invalid User ID or PIN.");
            return null;
        }
    }

    public void displayMenu(Account account) {
        ATMService atmService = new ATMService(account);
        int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    atmService.showTransactionHistory();
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atmService.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atmService.deposit(depositAmount);
                    break;
                case 4:
                    System.out.print("Enter target User ID: ");
                    scanner.nextLine(); // Consume newline
                    String targetUserId = scanner.nextLine();
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    Account targetAccount = accounts.get(targetUserId);
                    if (targetAccount != null) {
                        atmService.transfer(targetAccount, transferAmount);
                    } else {
                        System.out.println("Target account not found.");
                    }
                    break;
                case 5:
                    atmService.quit();
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
    }
}
