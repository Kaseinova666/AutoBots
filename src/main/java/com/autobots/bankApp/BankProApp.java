package com.autobots.bankApp;

public class BankProApp {
    public static void main(String[] args) {


        Client asan = new Client("Asan Uson", "123");

        DepositAccount asanDepositAccount = new DepositAccount(asan, Currency.USD);
        CreditAccount asanCreditAccount = new CreditAccount(asan, Currency.EUR);

//        asan.add
    }
}
