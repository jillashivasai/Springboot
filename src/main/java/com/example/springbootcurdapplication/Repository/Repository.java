package com.example.springbootcurdapplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootcurdapplication.Entity.User;

public interface Repository extends JpaRepository<User,Integer> {

    
} 
