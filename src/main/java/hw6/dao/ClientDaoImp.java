package hw6.dao;

import hw6.entity.Client;
import hw6.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class ClientDaoImp implements ClientDao {

    @Override
    public void save(Client client) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(client);
        transaction.commit();
        session.close();
    }

    @Override
    public Client getById(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session.byId(Client.class).getReference(id);
    }

    @Override
    public List<Client> getAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        return (List<Client>) session.createQuery("FROM hw6.entity.Client").list();
    }

    @Override
    public void delete(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Client client = session.load(Client.class, id);
        session.delete(client);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Client> getByPhone(long phone) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        return (List<Client>) session.createQuery("FROM hw6.entity.Client WHERE phone = :phone")
                .setParameter("phone", phone).list();
    }
}