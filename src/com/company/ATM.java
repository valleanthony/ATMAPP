package com.company;

import java.util.Scanner;

public class ATM {
    Account FIKRU = new  Account("fi","12ddf",700,"100");


    private  double deposite;
    private double withdraw;
    private double balance = FIKRU.getBalance();
    Scanner scan = new Scanner(System.in);
    public void userinfo(){
        System.out.println("enter your name ");
        String name = scan.nextLine();
        System.out.println("enter urpin no ");
        String pinNo = scan.nextLine();
        System.out.println("do you want deposit or withdraw");
        String withdrwaDeposit = scan.nextLine();
        if(withdrwaDeposit.equalsIgnoreCase("withdraw"))
            setWithdraw();
        else if(withdrwaDeposit.equalsIgnoreCase("deposit"))
            setDeposite();


    }

    public ATM() {
    }

    public ATM(double deposite, double withdraw) {
        this.deposite = deposite;
        this.withdraw = withdraw;
    }

    public double getDeposite() {
        return deposite;
    }

    public void setDeposite(double deposite) {
        this.deposite = deposite;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }
    public double getBalance(){
        return balance;
    }

    public void setDeposite(){
        if(this.balance<this.withdraw)
            System.out.println("you don't have sufficient balance ");
        else
            this.balance = this.balance+this.deposite;

        System.out.println( "you deposite "+ this.withdraw +" now the balance is " + this.balance);


    }
    public void setWithdraw(){
        this.balance = this.balance-this.withdraw;
        System.out.println( "you withdraw "+ this.withdraw +" now the balance is " + this.balance);

    }



}
