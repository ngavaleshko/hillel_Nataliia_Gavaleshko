package hw26.service;

import hw26.entity.Client;

import java.util.List;

public interface ClientService {
    void save(Client client);

    Client getById(int id);

    List<Client> getAll();

    void delete(Client client);

    List<Client> getByPhone(long phone);

    void update(Client client);
}
