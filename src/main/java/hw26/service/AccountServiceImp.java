package hw26.service;

import org.apache.log4j.Logger;
import hw26.dao.AccountDao;
import hw26.dao.AccountDaoImp;
import hw26.entity.Account;

import java.util.List;

public class AccountServiceImp implements AccountService {
    AccountDao accountDao = new AccountDaoImp();
    Logger logger = Logger.getLogger(AccountServiceImp.class);

    public void save(Account account) {
        accountDao.save(account);
    }

    @Override
    public Account getById(int id) {
        logger.debug(String.format("client.findById {id = %d}", id));
        return accountDao.getById(id);
    }

    @Override
    public void delete(Account account){
        logger.debug(account.toString());
        accountDao.delete(account);
    }
    @Override
    public List<Account> getAll() {
        logger.debug(getAll().toString());
        return accountDao.getAll();
    }
    public void update (Account account) {
        logger.debug(account.toString());
        accountDao.update(account);
    }

}
