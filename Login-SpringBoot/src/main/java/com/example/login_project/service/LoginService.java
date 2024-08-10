package com.example.login_project.service;

import com.example.login_project.entity.Login;

import java.util.List;

public interface LoginService {

    String getAddUser(Login login);

    List<Login> getData();

    Login getDataByUserName(String name);
}
