package com.example.login_project.controller;

import com.example.login_project.entity.Login;
import com.example.login_project.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LoginsController {

    @Autowired
    private LoginService service;

    @GetMapping("/test/")
    public List<Login> getLogin() {
        return service.getData();
    }
}
