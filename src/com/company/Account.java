package com.company;

public class Account {

    private int accountNumber;
    private String userName;
    private double balance;
    private String pin;



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

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Account() {
    }

    public Account(int accountNumber, String userName, String pin, double balance){
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.pin = pin;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }




}
