package com.example.SpringOneToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringOneToMany.dto.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{

}
