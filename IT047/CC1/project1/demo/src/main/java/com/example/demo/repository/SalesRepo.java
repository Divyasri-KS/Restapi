package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Sales;

@Repository
public interface SalesRepo extends JpaRepository<Sales,Long> {
    
  
   
}
