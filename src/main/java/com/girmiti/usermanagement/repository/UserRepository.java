package com.girmiti.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.girmiti.usermanagement.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

}
