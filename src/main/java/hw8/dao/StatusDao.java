package hw8.dao;

import hw8.entity.Status;

import java.util.List;

public interface StatusDao {

    void save(Status status);

    Status getById(int Id);

    void delete(Status status);

    void update (Status status);

}
