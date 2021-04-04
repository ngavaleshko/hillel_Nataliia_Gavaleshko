package hw6.service;

import hw6.entity.Status;

import java.util.List;

public interface StatusService {
    void save(Status status);

    Status getById(int Id);

    List<Status> getAll();

    void delete(int id);
}
