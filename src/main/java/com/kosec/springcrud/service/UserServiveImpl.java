package com.kosec.springcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosec.springcrud.model.Users;
import com.kosec.springcrud.service.UserService;
import com.kosec.springcrud.repository.UserRepository;

@Service
public class UserServiveImpl implements UserService{
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(Users users) {
        this.userRepository.save(users);
    }

    

}
