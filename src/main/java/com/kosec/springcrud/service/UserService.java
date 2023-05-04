package com.kosec.springcrud.service;

import java.util.*;

import com.kosec.springcrud.model.Users;

public interface UserService {
    List<Users> getAllUser();
    void saveUser(Users users); 
}
