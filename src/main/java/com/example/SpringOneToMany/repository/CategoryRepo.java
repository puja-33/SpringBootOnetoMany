package com.example.SpringOneToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringOneToMany.dto.Category;

@Repository
public interface CategoryRepo extends JpaRepository <Category,Integer> {

}
