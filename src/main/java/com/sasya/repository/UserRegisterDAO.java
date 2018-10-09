package com.sasya.repository;

import com.sasya.models.UserRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegisterDAO extends JpaRepository<UserRegister, Integer> {

}
