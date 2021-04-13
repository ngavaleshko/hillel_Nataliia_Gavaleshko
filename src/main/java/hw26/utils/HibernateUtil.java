package hw26.utils;

import hw26.entity.Account;
import hw26.entity.Client;
import hw26.entity.Status;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



public class HibernateUtil {
    static Logger logger = (Logger) Logger.getLogger(String.valueOf(HibernateUtil.class));
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
                logger.error("Configuration error: " + configuration);
            } catch (Exception e) {
               // System.out.println("Session factory Error: " + e);
                logger.error("Session error: " + e);
            }
        }
        return sessionFactory;
    }
}