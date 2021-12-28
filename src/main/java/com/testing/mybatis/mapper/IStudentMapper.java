package com.testing.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.testing.mybatis.entity.Student;

@Mapper
public interface IStudentMapper {
	@Select("Select * from students;")
	List<Student> findAll();
	
	@Delete("Delete from students where id = #{id};")
	void delete (String id);
	
	@Insert("Insert into students(id,name,age,major) values(#{id},#{name},#{age},#{major});")
	void insert(Student student);
	
	@Insert("Update students set name = #{name}, age =#{age}, major = #{major} where id = #{id};")
	void update(Student student);
}
