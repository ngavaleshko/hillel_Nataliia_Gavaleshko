package hw26.service;

import hw26.dao.ClientDao;
import hw26.dao.ClientDaoImp;
import hw26.entity.Client;
import org.apache.log4j.Logger;

import java.util.List;

public class ClientServiceImp implements ClientService {

    Logger logger = Logger.getLogger(ClientServiceImp.class);

    ClientDao clientDao = new ClientDaoImp();
    @Override
    public void save(Client client) {
        logger.debug(client.toString());
        clientDao.save(client);
    }
    @Override
    public void update (Client client) {
        logger.debug(String.format("update. client{id=%d, email=%s, phone = %d}",
                client.getId(), client.getEmail(), client.getPhone()));
        clientDao.update(client);
    }
    @Override
    public Client getById(int id) {
        logger.debug(String.format("client.findById {id = %d}", id));
        return clientDao.getById(id);
    }
    @Override
    public List<Client> getAll() {
        logger.debug(getAll().toString());
        return clientDao.getAll();
    }

    @Override
    public void delete(Client client){
        logger.debug(String.format("delete. client{id=%d, email=%s, phone = %d}",
                client.getId(), client.getEmail(), client.getPhone()));
        clientDao.delete(client);
    }
    @Override
    public List<Client>  getByPhone(long phone) {
        logger.debug(String.format("client.findByPhone {phone = %d}", phone));
        return clientDao.getByPhone(phone);
    }
}
