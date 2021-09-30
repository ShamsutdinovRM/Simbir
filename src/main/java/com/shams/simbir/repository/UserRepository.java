package com.shams.simbir.repository;

import com.shams.simbir.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Jpa-репозиторий для реализации CRUD-методов
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
