package com.kiu.restapi.service;

import com.kiu.restapi.model.Professor;
import com.kiu.restapi.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService extends EntityService<Professor> {

    @Autowired
    public ProfessorService(ProfessorRepository repository) {
        super(repository);
    }

}
