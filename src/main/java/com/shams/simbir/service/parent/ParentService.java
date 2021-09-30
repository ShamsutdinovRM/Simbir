package com.shams.simbir.service.parent;

import com.shams.simbir.entity.Parent;
import org.springframework.stereotype.Service;

import java.util.List;

//Интерфейс сервиса для CRUD-методов
@Service
public interface ParentService {
    public Parent findById(Long id);
    public List<Parent> findAll();
    public Parent saveParent(Parent parent);
    public void deleteById(Long id);
}
