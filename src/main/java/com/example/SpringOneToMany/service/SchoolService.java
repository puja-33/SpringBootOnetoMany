package com.example.SpringOneToMany.service;

import java.util.ArrayList;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringOneToMany.dto.School;
import com.example.SpringOneToMany.dto.Student;
import com.example.SpringOneToMany.repository.SchoolRepo;
import com.example.SpringOneToMany.repository.StudentRepo;



@Service
public class SchoolService {
	
	

	@Autowired
	StudentRepo srepo;
	
	@Autowired
	SchoolRepo repo;
	
  public School saveSchool(School school)
  {
	  repo.save(school);
	  return school;
  }

  public List<School> getAllSchool()
	{
		List<School> schools=new ArrayList<School>();
		repo.findAll().forEach(school -> schools.add(school));
		return schools;
	}
  public School updateSchool(int id,School school)
	{
		Optional<School> optional=repo.findById(id);
		if(optional.isPresent())
		{
			school.setId(id);
			school.setStudent(optional.get().getStudent());
			repo.save(school);
			return school;
		}
		return null;
		
	}
  public Student updatestudent(int id,Student student)
  {
	  Optional<Student> optional=srepo.findById(id);
	  if(optional.isPresent())
	  {
		  student.setId(id);
		  srepo.save(student);
		  return student;
	  }
	  return null;
	  
	  
  }
  
  
  public School deleteSchool(int id)
	{
		Optional<School> optional=repo.findById(id);
		if(optional.isPresent())
		{
			repo.deleteById(id);
			 return optional.get();
		}
		return null;
	}


}
	

