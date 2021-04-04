package hw6.dao;

import hw6.entity.Client;

import java.util.List;

public interface ClientDao {

   void save(Client client);

    Client getById(int Id);

    List<Client> getAll();

    void delete(int id);

    List<Client> getByPhone(long phone);
}
