package hw6.service;

import hw6.entity.Account;
import hw6.dao.AccountDao;
import hw6.dao.AccountDaoImp;

import java.util.List;

public class AccountServiceImp implements AccountService {

    public void save(Account account) {
        AccountDao accountDao = new AccountDaoImp();
        accountDao.save(account);
    }

    @Override
    public Account getById(int id) {
        AccountDao accountDao = new AccountDaoImp();
        return accountDao.getById(id);
    }
    @Override
    public List<Account> getAll() {
        AccountDao accountDao = new AccountDaoImp();
        return accountDao.getAll();
    }

    @Override
    public void delete(int id){
        AccountDao accountDao = new AccountDaoImp();
        accountDao.delete(id);
    }
}
