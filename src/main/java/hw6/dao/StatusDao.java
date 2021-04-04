package hw6.dao;

import hw6.entity.Status;

import java.util.List;

public interface StatusDao {

    void save(Status status);

    Status getById(int Id);

    List<Status> getAll();

    void delete(int id);
}
