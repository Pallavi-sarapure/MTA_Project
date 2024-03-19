package com.example.controller;

import com.example.entity.Student;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/student")
public class Controller {
	Student student;
	
	@GetMapping("{/studentid}")
	public Student getstudentdetails(String id) {
    return student;
}
	@PostMapping
	public String createstudentetails(@RequestBody Student student) {
		this.student=student;
		return "student deatails created successfully";	
	}
	@PutMapping("{studentid}")
	public String updatestudentdetails(@RequestBody Student student) {
		this.student=student;
		return "updated successfully";
				
	}
	@DeleteMapping("{studentid}")
	public String deletestudentdetails(String id) {
		this.student=null;
		return "deleted successfully";
				
	}
	
}