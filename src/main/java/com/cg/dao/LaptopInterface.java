package com.cg.dao;

import java.util.List;

import com.cg.Entity.Laptop;

public interface LaptopInterface {
	
	public String addLaptop(Laptop laptop);
	public List<Laptop> getallLaptops();

}
