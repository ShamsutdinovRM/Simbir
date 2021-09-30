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
    Long id;

    @Column(name = "name")
    String name;
    @Column(name = "description")
    String description;
    @Column(name = "count")
    Long count;
    /*@Column(name = "parent_id")
    Long parent_id;*/


    //Зависимость таблицы items от parent

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    Parent parent;
}
