package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CusMap;


@Repository
public interface CusMapRepo extends JpaRepository<CusMap,Long>{

    List<CusMap> findByLocationStartsWith(String location);
}