package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CusMap;
import com.example.demo.service.CusMapService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class CusMapController {
    @Autowired
    CusMapService cusMapService;

    @PostMapping("/postcus")  
    public CusMap post(@RequestBody CusMap cusMap)
    {
        return cusMapService.post(cusMap);
    }

    @GetMapping("/getcus")
    public List<CusMap> get()
    {
        return cusMapService.get();
    }
    @GetMapping("/getcus/sort/{cusName}")
    public List<CusMap> getcus(@PathVariable String cusName)
    {
        return cusMapService.sorts(cusName);
    }
    @GetMapping("/getcus/pages/{offset}/{pagenumber}")
    public List<CusMap> getpage(@PathVariable int  offset,@PathVariable int pagenumber)
    {
        return cusMapService.page(offset,pagenumber);
    }
    @GetMapping("/getcus/query")
    public List<CusMap> getquery(@RequestParam String cusName)
    {
        return cusMapService.query(cusName);
    }
}