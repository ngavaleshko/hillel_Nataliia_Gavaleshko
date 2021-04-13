package hw26.dao;

import hw26.entity.Client;

import java.util.List;

public interface ClientDao {

   void save(Client client);

    Client getById(int Id);

    List<Client> getAll();

    void delete(Client client);

    List<Client> getByPhone(long phone);
    void update (Client client);
}
