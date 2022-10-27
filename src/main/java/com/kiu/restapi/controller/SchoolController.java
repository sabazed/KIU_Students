package com.kiu.restapi.controller;

import com.kiu.restapi.model.School;
import com.kiu.restapi.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kiu/schools")
public class SchoolController extends AbstractController<School> {

    @Autowired
    public SchoolController(SchoolService service) {
        super(service);
    }
}
