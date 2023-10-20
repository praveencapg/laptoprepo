package com.cg.Entity;

public class Laptop {
	
	private int laptopId;
	private String brand;
	private String color;
	private String os;
	
	public Laptop() {}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", brand=" + brand + ", color=" + color + ", os=" + os + "]";
	}
	

}
