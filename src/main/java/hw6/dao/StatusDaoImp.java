package hw6.dao;

import hw6.entity.Status;
import hw6.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class StatusDaoImp implements StatusDao {
    @Override
    public void save(Status status) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(status);
        transaction.commit();
        session.close();
    }

    @Override
    public Status getById(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session.byId(Status.class).getReference(id);
    }

    @Override
    public List<Status> getAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        return (List<Status>) session.createQuery("FROM hw6.entity.Status").list();
    }

    @Override
    public void delete(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Status status = session.load(Status.class, id);
        session.delete(status);
        transaction.commit();
        session.close();
    }
}
