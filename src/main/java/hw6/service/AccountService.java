package hw6.service;

import hw6.entity.Account;

import java.util.List;

public interface AccountService {
    void save(Account account);

    Account getById(int Id);

    List<Account> getAll();

    void delete(int id);
}

