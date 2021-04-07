package hw8.service;

import hw8.entity.Status;

import java.util.List;

public interface StatusService {
    void save(Status status);

    Status getById(int Id);

    void delete(Status status);

    void update(Status status);
}
