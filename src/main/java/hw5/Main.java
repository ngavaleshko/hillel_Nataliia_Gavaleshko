package hw5;

import hw5.entity.Account;
import hw5.entity.Client;
import hw5.entity.Status;
import hw5.service.AccountService;
import hw5.service.ClientService;
import hw5.service.StatusService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientService();
        List<Client> clients =clientService.getAll();
        System.out.println(clients);

        Client client = new Client();

        client.setPhone(38065552542L);
        client.setAbout("superLongValue");
        client.setName("Alex222");
        client.setEmail("alex222@mail.ru");
        clientService.save(client);

        Client client2 = new Client();
        client2.setId(26);
        client2.setPhone(38065882922L);
        client2.setName("Coco5995");
        clientService.update(client2);

        Client client3 = new Client();
        client3.setPhone(38065552542L);
        clientService.delete(client3);

        AccountService accountService = new AccountService();
        List<Account> accounts = accountService.getAllAccounts();
        System.out.println(accounts);

        Account account = new Account();

        account.setValue(88389.222);
        account.setNumber("123456");
        account.setClient_id(123);
        accountService.saveAccount(account);

        Account account2 = new Account();
        account2.setNumber("111");
        account2.setValue(222.333);
        account2.setClient_id(9);
        accountService.updateAccount(account2);

        Account account3 = new Account();
        account3.setValue(88389.222);
        accountService.deleteAccount(account3);

        StatusService statusService = new StatusService();
        List<Status> statuses =statusService.getAllStatuses();
        System.out.println(statuses);
//
//        Status status = new Status();
//        status.setDescription("myDescription");
//        status.setAlias("Good");
//        statusService.saveStatuses(status);

        Status status1 = new Status();
        status1.setDescription("Perfect");
        status1.setId(4);
        statusService.updateStatuses(status1);

        Status status2 = new Status();
        status2.setId(4);
        statusService.deleteStatuses(status2);

        Client client4 = new Client();
        client4.setPhone(380998827722L);
        clientService.searchClientByPhone(client4);
        System.out.println(client4);

//        Account account4 = new Account();
//        account4.setValue(789632.12365);
//       accountService.getNumberFromAccount(account4);
//        System.out.println(account4);

        Client client5 = new Client();
        clientService.getAllWhereId();
        System.out.println(clientService.getAllWhereId());

        Client client6 = new Client();
        clientService.getAllWhere3Tables();
        System.out.println(clientService.getAllWhere3Tables());

    }
}
