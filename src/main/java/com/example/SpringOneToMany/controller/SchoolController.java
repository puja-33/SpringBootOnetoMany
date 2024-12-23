package com.example.SpringOneToMany.controller;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringOneToMany.dto.School;
import com.example.SpringOneToMany.dto.Student;
import com.example.SpringOneToMany.service.SchoolService;


@RestController
@RequestMapping("/school")
public class SchoolController {

	
	@Autowired
	SchoolService service;
	
	
	@PostMapping("/insert")
	public School saveSchool(@RequestBody School school)
	{
		return service.saveSchool(school);
	}
	
	
	@GetMapping("/get")
	public List<School> getAllSchool()
	{
		return service.getAllSchool();
	}


@PatchMapping("/update")
public School updateSchool(@RequestParam int id,@RequestBody School s)
{
	return service.updateSchool(id, s);
}


@PatchMapping("/updatestudent")
public Student updatestudent(@RequestParam int id,@RequestBody Student s1)
{
	return service.updatestudent(id, s1);
}
@DeleteMapping("/delete")
public School deleteSchool(@RequestParam int id)
{
	return service.deleteSchool(id);
}

}







