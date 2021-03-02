package service;

import entity.Client;

import static util.Helper.checkUsers;

public class TransactionService {
    public void moneyTransfer(Client client, String accountId) {
        checkUsers(client.getAccountId(),accountId);
    }
}