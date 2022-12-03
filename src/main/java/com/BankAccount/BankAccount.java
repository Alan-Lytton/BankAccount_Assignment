package com.BankAccount;

import java.util.Random;

/**
 * Class to create and manage Bank Accounts
 * @author alanlytton
 */
public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;
    private static int numOfAccounts;
    private static double bankSystemTotal;

    /**
     * Constructor to build objects and increment number of accounts variable.
     */
    public BankAccount(){
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        this.accountNumber = generateAccountNumber();
        numOfAccounts++;
    }

    /**
     * Getter to retrieve the balance of checking account
     * @return The checking account balance.
     */
    public double viewCheckingBalance(){
        return this.checkingBalance;
    }

    /**
     * Getter to retrieve the balance of savings account
     * @return The savings account balance
     */
    public double viewSavingsBalance(){
        return this.savingsBalance;
    }

    public String viewAccountNumber(){
        return this.accountNumber;
    }

    /**
     * Method to deposit funds to specified account
     * @param accountType Either Checking or Savings. Specifies the account for the deposit
     * @param amount Amount to be deposited into specified account.
     */
    public void deposit(String accountType, double amount){
        if (accountType.equals("Checking")){
            this.checkingBalance += amount;
            bankSystemTotal += amount;
        }
        if (accountType.equals("Savings")){
            this.savingsBalance +=amount;
            bankSystemTotal += amount;
        }
    }

    /**
     * Method to withdraw funds if there are enough in the account.
     * @param accountType Either Checking or Savings. Specifies the Account for the withdrawal.
     * @param amount Amount to be withdrawn from specified account.
     */
    public void withdrawal(String accountType, double amount){
        if (accountType.equals("Checking")){
            if(this.checkingBalance >= amount){
                this.checkingBalance -= amount;
            }
            else{
                System.out.println("Insufficient funds");
            }
        }
        if (accountType.equals("Savings")){
            if(this.savingsBalance >= amount){
                this.savingsBalance -= amount;
            }
            else{
                System.out.println("Insufficient funds");
            }
        }
    }

    /**
     * Method to return the combined values of both checking and savings accounts
     * @return the combined total of checking and savings.
     */
    public double viewCombinedTotal(){
        return (this.checkingBalance + this.savingsBalance);
    }

    /**
     * Generates a new random 10 digit number for the account holder
     * @return The 10 digit account number unique to that person.
     */
    private String generateAccountNumber(){
        Random randomNumber = new Random();
        String accountNumber = "";
        for(int i = 0; i<10; i++){
            accountNumber += randomNumber.nextInt(10);
        }
        return accountNumber;
    }
}
