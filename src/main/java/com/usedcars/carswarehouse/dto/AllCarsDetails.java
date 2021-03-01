package com.usedcars.carswarehouse.dto;

public class AllCarsDetails {
    private long _id;
    private String make;
    private String model;
    private long year_model;
    private double price;
    private boolean licensed;
    private String date_added;
    private String location;
    private String lat;
    private String longitude;
    private String warehouseName;

    public AllCarsDetails(long _id, String make, String model, long year_model, double price, boolean licensed,
                          String date_added, String location, String lat, String longitude, String warehouseName) {
        super();
        this._id = _id;
        this.make = make;
        this.model = model;
        this.year_model = year_model;
        this.price = price;
        this.licensed = licensed;
        this.date_added = date_added;
        this.location = location;
        this.lat = lat;
        this.longitude = longitude;
        this.warehouseName = warehouseName;
    }
    public long get_id() {
        return _id;
    }
    public void set_id(long _id) {
        this._id = _id;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public long getYear_model() {
        return year_model;
    }
    public void setYear_model(long year_model) {
        this.year_model = year_model;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isLicensed() {
        return licensed;
    }
    public void setLicensed(boolean licensed) {
        this.licensed = licensed;
    }
    public String getDate_added() {
        return date_added;
    }
    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getLat() {
        return lat;
    }
    public void setLat(String lat) {
        this.lat = lat;
    }
    public String getLongitude() {
        return longitude;
    }
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    public String getWarehouseName() {
        return warehouseName;
    }
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

}