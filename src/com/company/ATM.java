package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ATM {


    Account fikru = new  Account(67891,"12ddf","123",700);
    Account Anthony= new Account(12345,"valleant","000",50);
    Account phil = new Account(011121,"PHIL","456",2000);





        //This adds the account numbers into an array to validate if they are valid accounts stored in the system.
        public void metho3() {
            //Adding all accounts and pins to hashmap.
            HashMap<Integer, String> accno = new HashMap<Integer, String>();
            accno.put(67891,"123");
            accno.put(12345,"000");
            accno.put(01121,"456");
        }




    /*
    Start of ATM app
     */


    private  double deposite;
    private double withdraw;
    private double balance = Anthony.getBalance();

    boolean validacct = false;
    Scanner scan = new Scanner(System.in);


    public void userinfo() {
        //Adding all accounts and pins to hashmap.
        HashMap<Integer, String> accno = new HashMap<Integer, String>();
        accno.put(67891,"123");
        accno.put(12345,"000");
        accno.put(01121,"456");


        System.out.println("Hello, Please follow the instructions below:");
        System.out.println("Enter your account number");
        int account = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your pin number");
        String pinNo = scan.nextLine();


        //Validates account and pin
        if (pinNo.equalsIgnoreCase(accno.get(account))) {

            userGUI();


        } else {
            System.out.println("Please try again");
            userinfo();
        }
    }
        /// The GUI for the ATM. This section determines the user actions and the methods served up.

       public void userGUI(){
        validacct =true;
        while (validacct == true) {
            System.out.println("Hello " + Anthony.getUserName() + " What can we do for you today? ");
            System.out.println("1. Enter the number one for Deposits");
            System.out.println("2. Enter the number two for Withdraws");
            System.out.println("3. Enter the number three for Balance");
            System.out.println("4. Enter 4 to logout");
            int userinput = scan.nextInt();
            scan.nextLine();

            if (userinput == 1) {
                setDeposite();
            }

            if (userinput == 2) {
                setWithdraw();

            }
            if (userinput == 3) {
                //needs to be built
                System.out.println("your balance is "+this.balance);


            }
            if (userinput == 4) {
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
        System.out.println("Your current balance is " + getBalance());
        System.out.println("Please enter how much you would like to deposit");
        double userdeposit = scan.nextInt();
        scan.nextLine();

        this.balance = this.balance+userdeposit;

        System.out.println( "you deposite "+ userdeposit +" now the balance is " + this.balance);
        System.out.println("Would you like to go back to the main menu? (Y/N)");
        String userinput = scan.nextLine();
        if (userinput.equalsIgnoreCase("Y")){
            userGUI();
        }
       else{
           validacct =false;

        }



    }
    public void setWithdraw(){
        System.out.println("How much money would you like to withdraw?");
        double userWithdraw = scan.nextDouble();


        withdraw = userWithdraw;

        if(this.balance<this.withdraw){
            System.out.println("you don't have sufficient balance ");
        }
        else {
            this.balance = this.balance - this.withdraw;


            System.out.println("you withdraw " + userWithdraw + " now the balance is " + this.balance);
            userGUI();
        }

    }



}



