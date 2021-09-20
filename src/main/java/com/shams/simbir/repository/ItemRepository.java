package com.shams.simbir.repository;

import com.shams.simbir.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Jpa-репозиторий для реализации CRUD-методов
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
