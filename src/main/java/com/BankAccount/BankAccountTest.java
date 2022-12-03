package com.BankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount();
        BankAccount user2 = new BankAccount();

        System.out.println(user1.viewCheckingBalance());
        user1.deposit("Checking", 32.5);
        System.out.println(user1.viewCheckingBalance());
        user1.withdrawal("Checking", 10.0);
        System.out.println(user1.viewCheckingBalance());
        user1.deposit("Savings", 500);
        System.out.println(user1.viewCombinedTotal());

        System.out.println(user1.viewAccountNumber());
        System.out.println(user2.viewAccountNumber());


    }
}