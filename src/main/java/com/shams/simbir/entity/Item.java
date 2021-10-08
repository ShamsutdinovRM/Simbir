package com.shams.simbir.entity;

import lombok.Data;

import javax.persistence.*;

//Подключение к БД, таблица items
@Data
@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "count")
    private Long count;

    //Зависимость таблицы items от parent
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Parent parent;
}
