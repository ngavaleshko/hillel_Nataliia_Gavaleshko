package hw6.service;

import hw6.dao.StatusDao;
import hw6.dao.StatusDaoImp;

import hw6.entity.Status;

import java.util.List;

public class StatusServiceImp implements StatusService {

    public void save(Status status) {
        StatusDao statusDao = new StatusDaoImp();
        statusDao.save(status);
    }

    @Override
    public Status getById(int id) {
        StatusDao statusDao = new StatusDaoImp();
        return statusDao.getById(id);
    }
    @Override
    public List<Status> getAll() {
        StatusDao statusDao = new StatusDaoImp();
        return statusDao.getAll();
    }

    @Override
    public void delete(int id){
        StatusDao statusDao = new StatusDaoImp();
        statusDao.delete(id);
    }
}
