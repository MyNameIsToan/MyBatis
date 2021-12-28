package com.testing.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testing.mybatis.entity.Student;
import com.testing.mybatis.mapper.IStudentMapper;
import com.testing.mybatis.service.IStudentService;

@Service
public class StudentService implements IStudentService {
	@Autowired
	private IStudentMapper studentMapper;

	@Override
	public List<Student> FindAll() {
		return studentMapper.findAll();
	}

	@Override
	public List<Student> Delete(String id) {
		studentMapper.delete(id);
		return studentMapper.findAll();
	}

	@Override
	public List<Student> Insert(Student student) {
		studentMapper.insert(student);
		return studentMapper.findAll();
	}

	@Override
	public List<Student> Update(Student student) {
		studentMapper.update(student);
		return studentMapper.findAll();
	}


}
