package com.org.oop;

public class EncapsulationBankService {
    public static void main(String[] args) {
        EncapsulationBankAccountDemo account = new EncapsulationBankAccountDemo("33280795");
        account.deposit(10000);
        account.withdraw(1500);
        System.out.println(" Remaining Balance : "+account.getBalance());


    }
}
