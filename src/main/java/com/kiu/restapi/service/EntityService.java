package com.kiu.restapi.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class EntityService<T> {

    private final JpaRepository<T, Integer> repository;

    public EntityService(JpaRepository<T, Integer> repository) {
        this.repository = repository;
    }

    public T getEntity(int id) {
        return repository.findById(id).orElse(null);
    }

    public List<T> getEntities() {
        return repository.findAll();
    }

    public T addEntity(T student) {
        return repository.save(student);
    }

    public void removeEntity(int id) {
        repository.deleteById(id);
    }

}
