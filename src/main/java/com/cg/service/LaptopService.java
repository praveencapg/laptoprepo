package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.Entity.Laptop;
import com.cg.dao.LaptopInterface;


@Service
public class LaptopService implements LaptopInterface{
	
	List<Laptop> laptopList = new ArrayList<>();
	


	@Override
	public String addLaptop(Laptop laptop) {
		laptopList.add(laptop);
		
		return "Laptop added successfully";
	}
 
	@Override
	public List<Laptop> getallLaptops() {
		
		return laptopList;
	}

}
