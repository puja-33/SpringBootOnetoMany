package com.example.SpringOneToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.stereotype.Repository;

import com.example.SpringOneToMany.dto.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
