package hw8.service;

import hw8.entity.Account;

import java.util.List;

public interface AccountService {
    void save(Account account);

    Account getById(int Id);

    List<Account> getAll();

    void delete(Account account);

    void update (Account account);
}

