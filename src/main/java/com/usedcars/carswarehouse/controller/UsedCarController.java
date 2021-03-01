package com.usedcars.carswarehouse.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usedcars.carswarehouse.models.Warehouse;
import com.usedcars.carswarehouse.models.*;
import com.usedcars.carswarehouse.repository.WarehouseRepository;
import com.usedcars.carswarehouse.dto.AllCarsDetails;

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
    @GetMapping(value = "/allCars")
    public List<AllCarsDetails> getAllVehicles() {
    List<Warehouse> listWarehouse = repository.findAll();
    List<AllCarsDetails> allCarDetails = new ArrayList();
    for(Warehouse wh: listWarehouse)
    {
	 Cars cars = wh.getCars();
	 String warehouseName = wh.getName();

	 String latitude  = wh.getLocation().getLat();
	 String longitude = wh.getLocation().get_long();
	 String location = cars.getLocation();
	 List<Vehicle> vehicle = cars.getVehicles();
	 for (Vehicle vh : vehicle)
    	{
	    if (vh.isLicensed())
		{
		    AllCarsDetails allDetails = new AllCarsDetails(vh.get_id(),
                            vh.getMake(),
                            vh.getModel(),
                            vh.getYear_model(),
                            vh.getPrice(),
                            vh.isLicensed(),
                            vh.getDate_added(),
                            location, latitude, longitude, warehouseName);
			 allCarDetails.add(allDetails);
		}
    	}
	 }
    return allCarDetails;
}

    @GetMapping(value = "{name}")
    public Warehouse findByName(@PathVariable("name") String name) {
        return repository.findByName(name);
    }
}
