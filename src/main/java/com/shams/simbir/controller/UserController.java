package com.shams.simbir.controller;

import com.shams.simbir.entity.User;
import com.shams.simbir.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> findAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/usersId")
    public User findByIdUsers(Long id){
        return userService.findById(id);
    }

    @PostMapping("/saveUser")
    public User saveUser(User user){
        return userService.saveUser(user);
    }

    @DeleteMapping("/user-delete")
    public void deleteByIdUser(Long id) {
        userService.deleteById(id);
    }

}
