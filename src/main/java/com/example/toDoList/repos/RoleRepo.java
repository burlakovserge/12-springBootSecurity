package com.example.toDoList.repos;

import com.example.toDoList.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    }