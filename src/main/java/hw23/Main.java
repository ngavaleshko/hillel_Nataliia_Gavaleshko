package hw23;

import com.github.javafaker.Faker;
import hw23.entity.Account;
import hw23.entity.Cars;
import hw23.entity.Client;
import hw23.entity.Status;
import hw23.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Account account = new Account();
        Status status = new Status();
        Cars cars = new Cars();
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

        cars.setCarName(faker.lordOfTheRings().character());
        cars.setCarYear(faker.random().nextInt(1980, 2021));
        session.save(cars);
        status.setAlias(faker.name().firstName());
        status.setDescription("super good package");
        session.save(status);
        client.setAccount(account);
        account.setClient(client);
        cars.setAccount(account);

        transaction.commit();
        session.close();

    }
}
