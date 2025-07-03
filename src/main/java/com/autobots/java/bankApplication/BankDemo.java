package com.autobots.java.bankApplication;

public class BankDemo {
    public static void main(String[] args) throws Exception {
        MBank aliya = new MBank(123456789131L, 892923123);
        aliya.deposit(100000);

        Optima ulugbek = new Optima(123453789131L, 892923223);

        Bank.transferFunds(aliya, ulugbek, 500); // перевод из одного бан сч на др сч

        Demir zinaidaDemir = new Demir(123453780123L, 892923289);
        System.out.println(zinaidaDemir.getBalance());


        BankBase.allBankRecords.stream().filter(n -> n.getBalance() > 100).forEach(System.out::println);
        double allSumOfBanks = BankBase.allBankRecords.stream().mapToDouble(Bank::getBalance).sum();
        System.out.println(allSumOfBanks);


    }
}