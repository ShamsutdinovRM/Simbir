package com.shams.simbir.service.user;

import com.shams.simbir.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

//Интерфейс сервиса для CRUD-методов
@Service
public interface UserService {
    public User findById(Long id);
    public List<User> findAll();
    public User saveUser(User user);
    public void deleteById(Long id);
}
