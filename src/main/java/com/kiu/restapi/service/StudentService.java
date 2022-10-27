package com.kiu.restapi.service;

import com.kiu.restapi.model.Student;
import org.springframework.stereotype.Service;
import com.kiu.restapi.repository.StudentRepository;

@Service
public class StudentService extends EntityService<Student> {

    public StudentService(StudentRepository repository) {
        super(repository);
    }

}
