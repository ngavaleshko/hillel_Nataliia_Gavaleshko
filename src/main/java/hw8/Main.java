package hw8;

import com.github.javafaker.Faker;
import hw8.entity.Account;
import hw8.entity.Client;
import hw8.entity.Status;
import hw8.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Account account = new Account();
        Status status = new Status();

        Faker faker = new Faker();




        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        client.setEmail(faker.name().name() + "@gmail.com");
        client.setPhone(faker.random().nextLong(38066333));
        client.setAbout(faker.pokemon().location());
        client.setName(faker.music().instrument());
        client.setAge(faker.random().nextInt(1, 78));
        session.save(client);
        account.setNumber(faker.name().name());
        account.setValue(1.523);
        account.setClientId(2);
        session.save(account);
    }
}
