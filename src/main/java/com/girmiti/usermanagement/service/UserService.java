package com.girmiti.usermanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.girmiti.usermanagement.model.UserEntity;

@Service
public interface UserService {

	List<UserEntity> getAllUsers();
    UserEntity getUserById(Long id);
    UserEntity createUser(UserEntity user);
    UserEntity updateUser(UserEntity user);
    void deleteUser(Long id);
	
	

}
