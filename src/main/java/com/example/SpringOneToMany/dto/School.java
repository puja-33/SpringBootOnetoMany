package com.example.SpringOneToMany.dto;

import java.util.List;




import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String sname;
	String address;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "School_id")
	
	List<Student> student;
	
	public School() {
		// TODO Auto-generated constructor stub
	}

	public School( String sname, String address, List<Student> student) {
		super();
		
		this.sname = sname;
		this.address = address;
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", sname=" + sname + ", address=" + address + ", student=" + student + "]";
	}

	
}
