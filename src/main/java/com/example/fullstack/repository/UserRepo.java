package com.example.fullstack.repository;

import com.example.fullstack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
