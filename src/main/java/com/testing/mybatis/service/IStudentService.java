package com.testing.mybatis.service;

import java.util.List;

import com.testing.mybatis.entity.Student;

public interface IStudentService {
	List<Student> FindAll();
	List<Student> Delete(String id);
	List<Student> Insert(Student student);
	List<Student> Update(Student student);
}
