package hw26.service;

import hw26.entity.Status;

public interface StatusService {
    void save(Status status);

    Status getById(int Id);

    void delete(Status status);

    void update(Status status);
}
