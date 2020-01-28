package utils;
//TO DO

//Need to rework on this 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {
	/*
	 * Need to rework on this 
	{
		  "name": "string",
		  "type": "string",
		  "address": "string",
		  "address2": "string",
		  "city": "string",
		  "state": "string",
		  "zip": "string",
		  "lat": 0,
		  "lng": 0,
		  "hours": "string",
		  "services": {}
		}*/
	
	
	public String name;
	public String type;
	public String address;
	public String address2;
	public String city;
	public String state;
	public String zip;
	public String hours;
	public int lat;
	public int lng;
	public HashMap<String, Object> services;
	
	
	public HashMap<String, Object> getServices() {
		return services;
	}
	public void setServices(HashMap<String, Object> services) {
		this.services = services;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getHours() {
		return hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}
	public int getLat() {
		return lat;
	}
	public void setLat(int lat) {
		this.lat = lat;
	}
	public int getLng() {
		return lng;
	}
	public Store(String name, String type, String address, String address2, String city, String state, String zip,
			String hours, int lat, int lng,HashMap<String, Object> services) {
		super();
		this.name = name;
		this.type = type;
		this.address = address;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.hours = hours;
		this.lat = lat;
		this.lng = lng;
		this.services = services;
	}
	public void setLng(int lng) {
		this.lng = lng;
	}
	
	public String getDet( ) {
		
		return this.name +" "+ this.type +" "+ this.address +" "+this.address2 +" "+ this.city +" "+ this.state +" "+
			   this.zip+" "+ this.hours+" "+ this.lat+" "+ this.lng+" " +this.services;	
	}

}
