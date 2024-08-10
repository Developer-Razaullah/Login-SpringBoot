package com.example.login_project.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "login")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userName;
    private String password;
}
