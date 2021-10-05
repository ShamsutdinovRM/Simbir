package com.shams.simbir.entity;

import lombok.*;

import javax.persistence.*;

//Подключение к БД, таблица items
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "login")
    String login;
    @Column(name = "password")
    String password;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "role")
    Role role;

}
