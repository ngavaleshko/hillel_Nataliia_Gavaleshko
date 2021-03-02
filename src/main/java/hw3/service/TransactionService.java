package hw3.service;

import hw3.entity.Client;

import static hw3.util.Helper.checkUsers;

public class TransactionService {
    public void moneyTransfer(Client client, String accountId) {
        checkUsers(client.getAccountId(),accountId);
    }
}