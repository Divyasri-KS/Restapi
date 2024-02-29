package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.CusMap;
import com.example.demo.repository.CusMapRepo;
import com.example.demo.repository.HouseMapRepo;



@Service
public class CusMapService {

    @Autowired
    CusMapRepo cusmaprepo;
    HouseMapRepo houseMapRepo;
    public CusMap post(CusMap cusMap)
    {
        return cusmaprepo.save(cusMap);
    }
    public List<CusMap> get()
    {
        return cusmaprepo.findAll();
    }
    public List<CusMap> sorts(String location)
    {
        Sort sort=Sort.by(Sort.Direction.DESC,location);
        return cusmaprepo.findAll(sort);
    }
    public List<CusMap> page(int offset,int pagenumber)
    {
        return cusmaprepo.findAll(PageRequest.of(offset,pagenumber)).getContent();
    }
    public List<CusMap> query(String location)
    {
        return cusmaprepo.findByLocationStartsWith(location);
    }
}
