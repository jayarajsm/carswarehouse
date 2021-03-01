package com.usedcars.carswarehouse.controller;

import com.usedcars.carswarehouse.models.Warehouse;
import com.usedcars.carswarehouse.repository.WarehouseRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Configuration
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/warehouse")
public class UsedCarController {
    @Autowired
    private WarehouseRepository repository;

    @GetMapping(value = "/all")
    public List<Warehouse> index() {
        List<Warehouse> listWarehouse = repository.findAll();

        return listWarehouse;
    }

    @GetMapping(value = "{name}")
    public Warehouse findByName(@PathVariable("name") String name) {
        return repository.findByName(name);
    }
}
