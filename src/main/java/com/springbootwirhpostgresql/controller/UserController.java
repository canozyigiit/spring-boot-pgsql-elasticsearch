package com.springbootwirhpostgresql.controller;

import com.springbootwirhpostgresql.model.User;
import com.springbootwirhpostgresql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/gelAllES")
    public List<User> getAllES(){
       return userService.getAllES();
    }

    @GetMapping("/getAllDb")
    public List<User> getAllDb(){
        return userService.getAllDb();
    }


    @PostMapping("/saveDb")
    public User saveDb(@RequestBody User user){
        return userService.saveDb(user);
    }

    @PostMapping("/saveES")
    public User saveES(@RequestBody User user){
        return userService.saveES(user);
    }

    @PostMapping("/saveAllES")
    public List<User> saveAllES(@RequestBody List<User> users){
        return userService.saveAllES(users);
    }

    @GetMapping("/user/{id}")
    public User getById(@PathVariable("id") int id){
        return userService.getById(id);
    }


}
