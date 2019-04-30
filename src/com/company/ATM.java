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
        boolean validacct = false;

        //This section validates the account.

        if (account == Anthony.getAccountNumber()&& Anthony.getPin().equalsIgnoreCase(pinNo)){

            validacct =true;

        }
        else {
            System.out.println("try agian");

        }

        /// The GUI for the ATM. This section determines the user actions and the methods served up.
        while (validacct == true){
            System.out.println("Hello " + Anthony.getUserName()+ " What can we do for you today? " );
            System.out.println("1. Enter the number one for Deposits");
            System.out.println("2. Enter the number two for Withdraws");
            System.out.println("3. Enter the number three for Balance");
            System.out.println("4. Enter 4 to logout");
            int userinput = scan.nextInt();
            scan.nextLine();

            if(userinput == 1){

            }

            if(userinput == 2){

            }
            if (userinput == 3){

            }
            if (userinput == 4){
                System.out.println("you have been logged out ");
                validacct =false;
            }

            else{
                System.out.println("you have been logged out ");
                validacct = false;
            }




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
