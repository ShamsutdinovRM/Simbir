package com.shams.simbir.controller;


import com.shams.simbir.entity.Parent;
import com.shams.simbir.service.parent.ParentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/parent", produces = MediaType.APPLICATION_JSON_VALUE)
public class ParentController {

    private final ParentService parentService;

    public ParentController(ParentService parentService){
        this.parentService = parentService;
    }

    @GetMapping()
    public List<Parent> findAllParents(){
        return parentService.findAll();
    }

    @GetMapping("/{id}")
    public Parent findByIdParents(@PathVariable(name = "id") Long id){
        return parentService.findById(id);
    }

    @PostMapping("/saveParent")
    public Parent saveParent(Parent parent){
        return parentService.saveParent(parent);
    }

    @DeleteMapping("/parent-delete")
    public void deleteByIdParent(Long id){
        parentService.deleteById(id);
    }
}
