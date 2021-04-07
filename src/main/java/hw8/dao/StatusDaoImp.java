package hw8.dao;


import hw8.utils.HibernateUtil;
import hw8.entity.Status;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class StatusDaoImp implements StatusDao {

    Logger logger = Logger.getLogger(StatusDao.class);

    @Override
    public void save(Status status) {
        logger.debug(status.toString());
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(status);
        transaction.commit();
        session.close();
    }

    @Override
    public Status getById(int id) {
        logger.debug(String.format("status.findByID {id = %d}", id));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session.byId(Status.class).getReference(id);
    }

    @Override
    public void delete(Status status) {
        logger.debug(status.toString());
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(status);
        transaction.commit();
        session.close();
    }
    @Override
    public void update(Status status) {
        logger.debug(status.toString());
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(status);
        transaction.commit();
        session.close();
    }
}
