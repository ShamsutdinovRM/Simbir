package com.shams.simbir.entity;

import lombok.Data;

import javax.persistence.*;

//Подключение к БД, таблица items
@Data
@Entity
@Table(name = "parent")
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
}
