package com.atmapp;
public class ATMApp {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Account account = null;
        while (account == null) {
            account = atm.login();  // Login until successful
        }
        atm.displayMenu(account);  // Show ATM functionalities after login
    }
}
