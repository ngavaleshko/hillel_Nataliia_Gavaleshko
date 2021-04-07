package hw6;

import com.github.javafaker.Faker;
import hw6.service.StatusService;
import hw6.entity.Account;
import hw6.entity.Client;
import hw6.entity.Status;
import hw6.service.AccountService;
import hw6.service.AccountServiceImp;
import hw6.service.ClientService;
import hw6.service.ClientServiceImp;
import hw6.service.StatusServiceImp;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientServiceImp();
        Client client = new Client();
       Faker faker = new Faker();
        client.setEmail(faker.name().name() + "@gmail.com");
        client.setPhone(faker.random().nextLong(38066333));
        client.setAbout(faker.pokemon().location());
        client.setName(faker.music().instrument());
        client.setAge(faker.random().nextInt(1, 78));
        // clientService.save(client);

        Client byID = clientService.getById(168);
        System.out.println(byID);

        List<Client> clients = clientService.getAll();

        for (Client temp : clients) {
            System.out.println(temp.toString());
        }

        clientService.delete(172);

        List<Client> byPhone = clientService.getByPhone(38099887729L);
        System.out.println("selected client by phone: "+byPhone);

        AccountService accountService = new AccountServiceImp();
        Account account = new Account();
        account.setNumber(faker.name().name());
        account.setValue(11.523);
        account.setClientId(2);
        accountService.save(account);

        System.out.println("account get by id: " +accountService.getById(11));

        List<Account> accounts = accountService.getAll();

        for (Account temp : accounts) {
            System.out.println(temp.toString());
        }

        accountService.delete(112);

        StatusService statusService = new StatusServiceImp();
        Status status = new Status();
        status.setAlias(faker.name().name());
        status.setDescription("fake");
        statusService.save(status);

        System.out.println("status by id: "+statusService.getById(1));
        List<Status> statuses = statusService.getAll();
        for (Status temp : statuses) {
            System.out.println("all statuses: " + temp.toString());
        }
            statusService.delete(6);
    }
}
