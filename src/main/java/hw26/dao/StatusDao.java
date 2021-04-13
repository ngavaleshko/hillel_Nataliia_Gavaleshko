package hw26.dao;

import hw26.entity.Status;

public interface StatusDao {

    void save(Status status);

    Status getById(int Id);

    void delete(Status status);

    void update (Status status);

}
