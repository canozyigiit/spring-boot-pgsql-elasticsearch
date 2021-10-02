package com.springbootwirhpostgresql.service;

import com.springbootwirhpostgresql.model.User;
import com.springbootwirhpostgresql.jpaRepository.UserJpaRepository;
import com.springbootwirhpostgresql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    private UserJpaRepository userJpaRepository;
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserJpaRepository userJpaRepository, UserRepository userRepository) {
        this.userJpaRepository = userJpaRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllES() {
        List<User> usersList = new ArrayList<>();
        Iterable<User> users = userRepository.findAll();
        users.forEach(usersList::add);
        return usersList;
    }

    @Override
    public List<User> getAllDb(){
        return userJpaRepository.findAll();
    }

    @Override
    public User getById(int id) {
        return userJpaRepository.findById(id).orElse(null);
    }

    @Override
    public User saveDb(User user) {
        userRepository.save(user);
        return userJpaRepository.save(user);
    }

    @Override
    public User saveES(User user) {
      return   userRepository.save(user);
    }

    @Override
    public List<User> saveAllES(List<User> users) {
        List<User> usersList = new ArrayList<>();
        Iterable<User> savedUsers = userRepository.saveAll(users);
        savedUsers.forEach(usersList::add);
        return usersList;
    }
}
