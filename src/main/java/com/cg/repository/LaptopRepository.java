package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.Entity.Laptop;

@Repository
public interface LaptopRepository  extends JpaRepository<Laptop, Integer>{

}
