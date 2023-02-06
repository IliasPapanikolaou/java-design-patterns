package com.unipi.ipap.javadesignpatterns.proxy.atm;

// ATM is a proxy of BankAccount
public class Atm implements Account {

    private BankAccount bankAccount;

    @Override
    public void withdraw(double amount) {
        if (bankAccount == null) {
            this.bankAccount = new BankAccount();
        }
        bankAccount.withdraw(amount);
    }

    @Override
    public void getAccountNumber() {
        if (bankAccount == null) {
            this.bankAccount = new BankAccount();
        }
        bankAccount.getAccountNumber();
    }
}
