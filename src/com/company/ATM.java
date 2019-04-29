package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    Account FIKRU = new  Account(67891,"12ddf","123",700);
    Account Anthony= new Account(12345,"valleant","000",50);
    Account phil = new Account(011121,"PHIL","456",2000);
    ArrayList<Account> accounts = new ArrayList<Account>();
//    public Account arryadder(){
//        accounts.add(Anthony);
//        accounts.add(FIKRU);
//        accounts.add(phil);
//        for(Account ACC:accounts){
//            return ACC;
//        }
//        return
//
//    }


    private  double deposite;
    private double withdraw;
    private double balance = Anthony.getBalance();

    Scanner scan = new Scanner(System.in);


    public void userinfo(){
        System.out.println("enter your Account ");
        int account = scan.nextInt();
        scan.nextLine();
        System.out.println("enter your pin no ");
        String pinNo = scan.nextLine();


        if (account == Anthony.getAccountNumber()&& Anthony.getPin().equalsIgnoreCase(pinNo)){
            System.out.println("do you want deposit or withdraw");
            String withdrwaDeposit = scan.nextLine();
            if(withdrwaDeposit.equalsIgnoreCase("withdraw"))
                setWithdraw();
            else if(withdrwaDeposit.equalsIgnoreCase("deposit"))
                setDeposite();

        }
        else {
            System.out.println("try agian  ");

        }



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

            this.balance = this.balance+this.deposite;

        System.out.println( "you deposite "+ this.deposite +" now the balance is " + this.balance);


    }
    public void setWithdraw(){
        if(this.balance<this.withdraw)
            System.out.println("you don't have sufficient balance ");
        else {
            this.balance = this.balance - this.withdraw;
            System.out.println("you withdraw " + this.withdraw + " now the balance is " + this.balance);
        }

    }



}
