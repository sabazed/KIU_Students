package com.kiu.restapi.service;

import com.kiu.restapi.model.Course;
import com.kiu.restapi.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService extends EntityService<Course> {

    @Autowired
    public CourseService(CourseRepository repository) {
        super(repository);
    }

}
