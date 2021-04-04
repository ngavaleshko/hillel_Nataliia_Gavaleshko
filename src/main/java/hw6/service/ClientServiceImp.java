package hw6.service;

import hw6.dao.ClientDao;
import hw6.dao.ClientDaoImp;
import hw6.entity.Client;

import java.util.List;

public class ClientServiceImp implements ClientService {

    public void save(Client client) {
        ClientDao clientDao = new ClientDaoImp();
        clientDao.save(client);
    }

    @Override
    public Client getById(int id) {
        ClientDao clientDao = new ClientDaoImp();
        return clientDao.getById(id);
    }
    @Override
    public List<Client> getAll() {
        ClientDao clientDao = new ClientDaoImp();
        return clientDao.getAll();
    }

    @Override
    public void delete(int id){
        ClientDao clientDao = new ClientDaoImp();
        clientDao.delete(id);
    }
    @Override
    public List<Client>  getByPhone(long phone) {
        ClientDao clientDao = new ClientDaoImp();
        return clientDao.getByPhone(phone);
    }
}
