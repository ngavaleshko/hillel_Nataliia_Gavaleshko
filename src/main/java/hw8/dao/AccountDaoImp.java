package hw8.dao;

import hw8.utils.HibernateUtil;
import hw8.entity.Account;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class AccountDaoImp implements AccountDao {

    Logger logger = Logger.getLogger(AccountDao.class);

    @Override
    public void save(Account account) {
        logger.debug(account.toString());
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(account);
        transaction.commit();
        session.close();
    }
    public void update(Account account) {
        logger.debug(account.toString());
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(account);
        transaction.commit();
        session.close();
    }

    @Override
    public Account getById(int id) {
        logger.debug(String.format("account.findById {id = %d}", id));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session.byId(Account.class).getReference(id);
    }

    @Override
    public List<Account> getAll() {
        return null;
    }

    @Override
    public void delete(Account account) {
        logger.debug(account.toString());
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(account);
        transaction.commit();
        session.close();
    }
}
