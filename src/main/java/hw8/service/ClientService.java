package hw8.service;

import hw8.entity.Client;

import java.util.List;

public interface ClientService {
    void save(Client client);

    Client getById(int id);

    List<Client> getAll();

    void delete(Client client);

    List<Client> getByPhone(long phone);

    void update(Client client);
}
