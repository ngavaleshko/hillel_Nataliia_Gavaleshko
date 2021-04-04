package hw6.dao;

import hw6.entity.Account;

import java.util.List;

public interface AccountDao {

    void save(Account account);

    Account getById(int Id);

    List<Account> getAll();

    void delete(int id);
}
