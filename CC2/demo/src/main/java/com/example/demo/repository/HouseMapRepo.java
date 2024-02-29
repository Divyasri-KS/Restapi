package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.HouseMap;


@Repository
public interface HouseMapRepo extends JpaRepository<HouseMap,Long>{
    
}