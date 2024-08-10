package com.example.login_project.controller;

import com.example.login_project.entity.Login;
import com.example.login_project.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class LoginController {

    @Autowired
    private LoginService service;

    @GetMapping("/logins")
    public List<Login> getLogin() {
        return service.getData();
    }

    @GetMapping("/login")
    public Login getLogins(@RequestParam("userName") String name) {
        return service.getDataByUserName(name);
    }

    @PostMapping("/add/user")
    public String getAddUser(@RequestBody Login login) {
        return service.getAddUser(login);
    }
}
