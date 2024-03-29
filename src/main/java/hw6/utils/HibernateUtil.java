package hw6.utils;

import hw6.entity.Account;
import hw6.entity.Client;
import hw6.entity.Status;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
        private static SessionFactory sessionFactory;
        public static SessionFactory getSessionFactory() {
            if (sessionFactory == null) {
                try {
                    Configuration configuration = new Configuration().configure();

                    configuration.addAnnotatedClass(Client.class);
                    configuration.addAnnotatedClass(Account.class);
                    configuration.addAnnotatedClass(Status.class);

                    StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                            .applySettings(configuration.getProperties());
                    sessionFactory = configuration.buildSessionFactory(builder.build());
                } catch (Exception e) {
                    System.out.println("Session factory Error: " + e);
                }
            }
            return sessionFactory;
        }
    }
