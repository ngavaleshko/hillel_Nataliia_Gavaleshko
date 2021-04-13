package hw26.service;

import hw26.dao.StatusDao;
import hw26.dao.StatusDaoImp;
import hw26.entity.Status;
import org.apache.log4j.Logger;

public class StatusServiceImp implements StatusService {

    Logger logger = Logger.getLogger(StatusService.class);
    StatusDao statusDao = new StatusDaoImp();

    public void save(Status status) {
        logger.debug(status.toString());
        statusDao.save(status);
    }

    @Override
    public Status getById(int id) {
        logger.debug(String.format("status.findByID {id = %d}", id));
        return statusDao.getById(id);
    }

    @Override
    public void delete(Status status){
        logger.debug(status.toString());
        statusDao.delete(status);
    }

    @Override
    public void update(Status status) {
        logger.debug(status.toString());
        statusDao.update(status);
    }
}
