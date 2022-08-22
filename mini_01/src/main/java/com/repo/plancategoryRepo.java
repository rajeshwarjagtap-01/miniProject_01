package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.plancategory;
@Repository
public interface plancategoryRepo extends JpaRepository<plancategory,Integer>{

}
