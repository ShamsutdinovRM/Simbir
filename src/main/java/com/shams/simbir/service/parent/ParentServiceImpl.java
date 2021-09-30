package com.shams.simbir.service.parent;

import com.shams.simbir.entity.Parent;
import com.shams.simbir.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Реализация CRUD-методов
@Service
public class ParentServiceImpl implements ParentService{

    final ParentRepository parentRepository;

    @Autowired
    public ParentServiceImpl(ParentRepository parentRepository){
        this.parentRepository = parentRepository;
    }

    @Override
    public Parent findById(Long id) {
        return parentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Parent> findAll() {
        return parentRepository.findAll();
    }

    @Override
    public Parent saveParent(Parent parent) {
        return parentRepository.save(parent);
    }

    @Override
    public void deleteById(Long id) {
        parentRepository.deleteById(id);
    }
}
