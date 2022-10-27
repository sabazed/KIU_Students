package com.kiu.restapi.controller;

import com.kiu.restapi.model.Professor;
import com.kiu.restapi.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kiu/professors")
public class ProfessorController extends AbstractController<Professor> {

    @Autowired
    public ProfessorController(ProfessorService service) {
        super(service);
    }

}
