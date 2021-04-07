package hw8.dao;

import hw8.utils.HibernateUtil;
import hw8.entity.Client;
import hw8.service.ClientService;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ClientDaoImp implements ClientDao {
    Logger logger = Logger.getLogger(ClientService.class);
    @Override
    public void save(Client client) {
        logger.debug(client.toString());
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(client);
        transaction.commit();
        session.close();
    }

    @Override
    public Client getById(int id) {
        logger.debug(String.format("client.findById {id = %d}", id));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session.byId(Client.class).getReference(id);
    }

    @Override
    public List<Client> getAll() {
        logger.debug(getAll().toString());
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        return (List<Client>) session.createQuery("FROM hw6.entity.Client").list();
    }

    @Override
    public void delete(Client client) {
        logger.debug(String.format("delete. client{id=%d, email=%s, phone = %d}",
                client.getId(), client.getEmail(), client.getPhone()));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(client);
        transaction.commit();
        session.close();
    }
    public void update(Client client) {
        logger.debug(client.toString());
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(client);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Client> getByPhone(long phone) {
        logger.debug(String.format("client.findByPhone {phone = %d}", phone));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        return (List<Client>) session.createQuery("FROM hw6.entity.Client WHERE phone = :phone")
                .setParameter("phone", phone).list();
    }
}