package com.testing.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.mybatis.entity.Student;
import com.testing.mybatis.service.IStudentService;

@RestController
@RequestMapping("/api/student-management")
public class StudentController {
	
	@Autowired
	private IStudentService studentService;
	
	@GetMapping()
	public List<Student> GetAll(){
		return studentService.FindAll();
	}
	
	@DeleteMapping("/{id}")
	public List<Student> Delete(@PathVariable("id") String id){
		return studentService.Delete(id);
	}
	
	@PostMapping()
	public List<Student> Insert(@RequestBody Student student){
		return studentService.Insert(student);
	}
	
	@PutMapping()
	public List<Student> Update(@RequestBody Student student){
		return studentService.Update(student);
	}
}
