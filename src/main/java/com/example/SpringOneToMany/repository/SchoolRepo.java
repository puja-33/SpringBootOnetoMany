package com.example.SpringOneToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.example.SpringOneToMany.dto.School;

@Repository
public interface SchoolRepo extends JpaRepository<School, Integer>{

}
