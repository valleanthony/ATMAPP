package com.company;

import java.util.Scanner;

public class ATM {
    Account FIKRU = new  Account();


    private  double deposite;
    private double withdraw;
    private double balance;
    Scanner scan = new Scanner(System.in);
    public void userinfo(){
        System.out.println("");

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

    public void setDeposite(){
        if(this.balance<withdraw)
            System.out.println("you don't have sufficient balance ");
        this.balance = this.balance-getWithdraw();


    }
    public void setWithdraw(){
        this.balance = this.balance+this.deposite;

    }



}
