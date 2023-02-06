package com.unipi.ipap.javadesignpatterns.proxy.atm;

public class BankAccount implements Account {

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing " + amount + " euro from Bank Account...");
    }

    @Override
    public void getAccountNumber() {
        System.out.println("Account Number: 1234-5678-91011-121314");
    }
}
