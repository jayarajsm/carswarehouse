package com.usedcars.carswarehouse.models;

public final class Vehicle {
    		private long _id;
            private String make;
            private String model;
            private long year_model;
            private double price;
            private boolean licensed;
            private String date_added;
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
        	           
    }
