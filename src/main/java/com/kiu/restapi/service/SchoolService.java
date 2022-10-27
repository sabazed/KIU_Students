package com.kiu.restapi.service;

import com.kiu.restapi.model.School;
import com.kiu.restapi.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService extends EntityService<School> {

    @Autowired
    public SchoolService(SchoolRepository repository) {
        super(repository);
    }

}
