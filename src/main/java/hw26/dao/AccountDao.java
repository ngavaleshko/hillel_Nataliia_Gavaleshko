package hw26.dao;

import hw26.entity.Account;

import java.util.List;

public interface AccountDao {

    void save(Account account);

    Account getById(int Id);

    List<Account> getAll();

    void delete(Account account);

    void update (Account account);
}
