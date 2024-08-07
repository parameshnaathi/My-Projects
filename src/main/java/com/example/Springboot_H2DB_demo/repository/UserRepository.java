package com.example.Springboot_H2DB_demo.repository;

import com.example.Springboot_H2DB_demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
