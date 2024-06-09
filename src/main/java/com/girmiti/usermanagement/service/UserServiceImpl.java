package com.girmiti.usermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girmiti.usermanagement.model.UserEntity;
import com.girmiti.usermanagement.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	
	 @Autowired
	    private UserRepository userRepository;

	    @Override
	    public List<UserEntity> getAllUsers() {
	        return userRepository.findAll();
	    }

	    @Override
	    public UserEntity getUserById(Long id) {
	        return userRepository.findById(id).get();
	    }

	    @Override
	    public UserEntity createUser(UserEntity user) {
	        return userRepository.save(user);
	    }

	    @Override
	    public UserEntity updateUser(UserEntity user) {
	        return userRepository.save(user);
	    }

	    @Override
	    public void deleteUser(Long id) {
	        userRepository.deleteById(id);
	    }
}

