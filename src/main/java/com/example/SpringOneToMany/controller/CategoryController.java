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

import com.example.SpringOneToMany.dto.Category;
import com.example.SpringOneToMany.dto.Product;

import com.example.SpringOneToMany.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	
	@Autowired
	CategoryService service;
	
	@PostMapping("/insert")
	public Category saveCategory(@RequestBody Category category)
	{
		return service.saveCategory(category);
	}
	
	@GetMapping("/get")
	public List<Category> getAllCategory()
	{
		return service.getAllCategory();
	}
	
	@PatchMapping("/update")
	public Category updateCategory(@RequestParam int id,@RequestBody Category c)
	{
		return service.updateCategory(id, c);
	}

	@PatchMapping("/updateproduct")
	public Product updateproduct(@RequestParam int id,@RequestBody Product p1)
	{
		return service.updateProduct(id, p1);
	}
	
	@DeleteMapping("/delete")
	public Category deleteCategory(@RequestParam int id)
	{
		return service.deleteCategory(id);
	}
}
