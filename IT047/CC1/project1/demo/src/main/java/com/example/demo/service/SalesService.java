package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Sales;
import com.example.demo.repository.SalesRepo;

@Service
public class SalesService {
    @Autowired
    SalesRepo salesRepo;
    Sales salesavail;
    @SuppressWarnings("null")
    public Sales addsales(Sales sales) 
    {
        return salesRepo.save(sales);//insert
    }
    public List<Sales> getsales()
    {
        return salesRepo.findAll();//returns all details
    }
    @SuppressWarnings("null")
    public java.util.Optional<Sales> getsalesbyId(Long id)
    {
        return salesRepo.findById(id);
    }
    @SuppressWarnings("null")
    public Sales editsales(Long loginid,Sales sales)
    {
        salesavail = salesRepo.findById(loginid).orElse(null);
        if(salesavail !=null)
        {    
              salesavail.setSalesmail(sales.getSalesmail());
              salesavail.setPassword(sales.getPassword());
             return salesRepo.saveAndFlush(salesavail);
        }
        else
        return null;
    }

    @SuppressWarnings("null")
    public void delsales(Long loginid)
    {
         salesRepo.deleteById(loginid);
    }
    
}
