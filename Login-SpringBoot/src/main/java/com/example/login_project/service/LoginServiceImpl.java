package com.example.login_project.service;

import com.example.login_project.entity.Login;
import com.example.login_project.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginRepository repository;

    @Override
    public String getAddUser(Login login) {
        Login user = new Login();
        user.setUserName(login.getUserName());
        user.setPassword(login.getPassword());
        if (user.getUserName() != null && user.getPassword() != null) {
            repository.save(user);
        } else {
            return "UserName or Password not add as a input";
        }
        return "User Details Save Successful";
    }

    @Override
    public List<Login> getData() {
        return repository.findAll();
    }

    @Override
    public Login getDataByUserName(String name) {
        return repository.findByUserName(name);
    }
}
