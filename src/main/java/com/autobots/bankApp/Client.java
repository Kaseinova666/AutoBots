package com.autobots.bankApp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Client {

    private final String fullName;
    private final String clientId;
    private final String pin;
    private final List<BankAccount> accounts = new ArrayList<>();

    public Client(String fullName, String pin) {
        this.fullName = fullName;
        this.pin = pin;
        this.clientId = String.valueOf(UUID.randomUUID());

    }

    public void addAccount (BankAccount account) {
        accounts.add(account);
    }

    public boolean authenticate (String inputPin) {
        return this.pin.equals(inputPin);
    }

    public String getFullName() {
        return fullName;
    }

    public String getClientId() {
        return clientId;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
}
