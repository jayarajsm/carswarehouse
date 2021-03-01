package com.usedcars.carswarehouse.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "warehouse")
public class Warehouse {
	private String _id;
    private String name;
    private Location location;
    private Cars cars;
    public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Cars getCars() {
		return cars;
	}
	public void setCars(Cars cars) {
		this.cars = cars;
	}
}
