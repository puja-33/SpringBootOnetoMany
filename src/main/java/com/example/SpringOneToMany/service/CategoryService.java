package com.example.SpringOneToMany.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringOneToMany.dto.Category;
import com.example.SpringOneToMany.dto.Product;

import com.example.SpringOneToMany.repository.CategoryRepo;
import com.example.SpringOneToMany.repository.ProductRepo;

@Service
public class CategoryService {
	
	@Autowired
	ProductRepo prepo;
	
	@Autowired
	CategoryRepo  crepo;
	
	public Category saveCategory(Category category)
	{
		crepo.save(category);
		return category;
	}
	public List<Category> getAllCategory(){
		List<Category> categorys=new ArrayList<Category>();
		crepo.findAll().forEach(category -> categorys.add(category));
		return categorys;
	}
	
	public Category updateCategory(int id,Category category)
	{
		Optional<Category> optional=crepo.findById(id);
		if(optional.isPresent())
		{
			category.setId(id);
			category.setProduct(optional.get().getProduct());
			crepo.save(category);
			return category;
		}
		return null;
		
	}
	 public Product updateProduct(int id,Product product)
	  {
		  Optional<Product> optional=prepo.findById(id);
		  if(optional.isPresent())
		  {
			  product.setId(id);
			  prepo.save(product);
			  return product;
		  }
		  return null;
		  
		  
	  }
	 public Category deleteCategory(int id)
		{
			Optional<Category> optional=crepo.findById(id);
			if(optional.isPresent())
			{
				crepo.deleteById(id);
				 return optional.get();
			}
			return null;
		}


	  

}
