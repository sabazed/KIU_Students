package com.kiu.restapi.controller;

import com.kiu.restapi.model.Student;
import com.kiu.restapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kiu/students")
public class StudentController extends AbstractController<Student> {

    @Autowired
    public StudentController(StudentService service) {
        super(service);
    }

}
