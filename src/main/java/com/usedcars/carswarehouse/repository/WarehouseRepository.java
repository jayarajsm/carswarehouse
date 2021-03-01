package com.usedcars.carswarehouse.repository;

import java.util.List;

import com.usedcars.carswarehouse.models.Cars;
import com.usedcars.carswarehouse.models.Warehouse;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface WarehouseRepository extends MongoRepository<Warehouse, String> {

    List<Warehouse> findAll();
    Warehouse findByName(String name);

}