package hw8.dao;

import hw8.entity.Client;
import hw8.entity.Status;

import java.util.List;

public interface ClientDao {

   void save(Client client);

    Client getById(int Id);

    List<Client> getAll();

    void delete(Client client);

    List<Client> getByPhone(long phone);
    void update (Client client);
}
