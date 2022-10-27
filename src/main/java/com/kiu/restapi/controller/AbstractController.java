package com.kiu.restapi.controller;

import com.kiu.restapi.service.EntityService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class AbstractController<T> {

    private final EntityService<T> service;

    public AbstractController(EntityService<T> service) {
        this.service = service;
    }

    @GetMapping({"", "/"})
    public List<T> getEntities() {
        return service.getEntities();
    }

    @GetMapping("/{id}")
    public T getEntity(@PathVariable(value = "id") int id) {
        return service.getEntity(id);
    }

    @PostMapping("/new")
    public T addEntity(@RequestBody T entity) {
        return service.addEntity(entity);
    }

    @DeleteMapping("/remove/{id}")
    public void removeEntity(@PathVariable(value = "id") int id) {
        service.removeEntity(id);
    }

}
