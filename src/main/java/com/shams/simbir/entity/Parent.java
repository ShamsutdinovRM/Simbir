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
    Long id;

    @Column(name = "name")
    String name;

    //Зависимость таблицы items от parent
    @OneToOne(mappedBy = "parent")
    Item item;

}
