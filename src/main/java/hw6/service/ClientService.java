package hw6.service;

import hw6.entity.Client;

import java.util.List;

public interface ClientService {
    void save(Client client);
    Client getById(int id);
    List<Client> getAll();
    void delete(int id);
    List<Client> getByPhone(long phone);
}
