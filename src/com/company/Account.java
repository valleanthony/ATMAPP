package com.company;

public class Account {

    private int accountNumber;
    private String userName;
    private ATM balance ="some balance";
    private int pin;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Account() {
    }

    public Account(int accountNumber, String userName, int pin) {
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.pin = pin;
    }




}
