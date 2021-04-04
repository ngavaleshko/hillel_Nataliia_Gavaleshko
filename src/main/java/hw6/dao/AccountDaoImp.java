package hw6.dao;

import hw6.entity.Account;
import hw6.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class AccountDaoImp implements AccountDao {
    @Override
    public void save(Account account) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(account);
        transaction.commit();
        session.close();
    }

    @Override
    public Account getById(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session.byId(Account.class).getReference(id);
    }

    @Override
    public List<Account> getAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        return (List<Account>) session.createQuery("FROM hw6.entity.Account").list();
    }

    @Override
    public void delete(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Account account = session.load(Account.class, id);
        session.delete(account);
        transaction.commit();
        session.close();
    }
}
