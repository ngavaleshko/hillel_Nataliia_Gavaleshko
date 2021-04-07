package hw8.service;

import hw8.dao.ClientDao;
import hw8.dao.ClientDaoImp;
import hw8.entity.Client;
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
        logger.debug(client.toString());
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
        logger.debug(String.format("client.findById {id = %d}", client));
        clientDao.delete(client);
    }
    @Override
    public List<Client>  getByPhone(long phone) {
        logger.debug(String.format("client.findByPhone {phone = %d}", phone));
        return clientDao.getByPhone(phone);
    }
}
