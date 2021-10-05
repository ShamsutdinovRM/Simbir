package com.shams.simbir.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.swing.*;
import java.util.Set;

//Подключение к БД, таблица items
@Data
@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;
    @Column(name = "description")
    String description;
    @Column(name = "count")
    Long count;

    //Зависимость таблицы items от parent
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Parent parent;
}
