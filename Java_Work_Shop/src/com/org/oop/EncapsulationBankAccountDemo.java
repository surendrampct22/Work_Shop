package com.org.oop;

public class EncapsulationBankAccountDemo {
    //make a field private
    private String accountNumber;
    private double balance;

    public EncapsulationBankAccountDemo(String accountNumber) {
        this.accountNumber = accountNumber;
        //When Account is created balance will be 0
        this.balance = 0;
    }

    //This is the logic for deposit
    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Deposit successful : "+amount);
        }
        else{
            System.out.println("Invalid amount : "+amount);
        }


    }
    //This is the logic for withdraw
    public void withdraw(double amount){
        if(amount >0 && amount<=balance){
            balance=balance-amount;
            System.out.println("Withdraw amount successfully : "+amount);
        }
        else{
            System.out.println("Transaction failed : "+amount);
        }

    }

    public double getBalance(){
        return balance;
    }

}
