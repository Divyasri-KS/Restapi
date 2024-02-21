package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Sales;
import com.example.demo.service.SalesService;


@RestController
public class SalesController {
    @Autowired SalesService salesService;
    Sales salesavail;
    @PostMapping ("/postsale")
    public Sales addsales(@RequestBody Sales sales)
    {
        return salesService.addsales(sales);
    }
    @GetMapping ("/getsale")
    public List<Sales> getsales()
    {
        return salesService.getsales();
    }
    @GetMapping("/api/sale/{salesId}")
    public Optional<Sales> getsalesbyId(@PathVariable Long salesId)
    {
        return salesService.getsalesbyId(salesId);
    }
    @PutMapping("/editsale/{loginid}")
    public Sales editsales(@PathVariable Long loginid, @RequestBody Sales sales) {
        
        
        return salesService.editsales(loginid,sales);
    }

    @DeleteMapping("/delsale/{loginid}")
    public void delsales(@PathVariable Long loginid)
    {
         salesService.delsales(loginid);
    } 
    
}