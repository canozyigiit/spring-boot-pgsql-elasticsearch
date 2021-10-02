package com.springbootwirhpostgresql.service;

import com.springbootwirhpostgresql.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllES();
    User getById(int id);
    User saveDb(User user);
    User saveES(User user);
    List<User> saveAllES(List<User> users);
    List<User> getAllDb();
}
