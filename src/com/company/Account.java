package com.company;

public class Account {

    private int accountNumber;
    private String userName;
    private double balance;
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

    public Account(int accountNumber, String userName, int pin, double balance){
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.pin = pin;
        this.balance = balance;
    }

public String validaccounts(){
        if(accountNumber == 12345 && pin ==000 || accountNumber ==67891 && pin == 123 || accountNumber ==011121 && pin 456){
            return "this is a valid account";
        }

        else{
            return "Not valid";
        }
}


}
