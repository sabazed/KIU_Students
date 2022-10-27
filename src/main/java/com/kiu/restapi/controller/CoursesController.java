package com.kiu.restapi.controller;

import com.kiu.restapi.model.Course;
import com.kiu.restapi.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kiu/courses")
public class CoursesController extends AbstractController<Course> {

    @Autowired
    public CoursesController(CourseService service) {
        super(service);
    }

}
