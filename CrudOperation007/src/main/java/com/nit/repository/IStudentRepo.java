package com.nit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer> {

	public Student findByName(String name);
	public List<Student> findByFeeLessThan(double fee);
	//New
	public List<Student> findByFeeGreaterThanEqual(double fee);
	public List<Student> findByNameAndAddr(String name, String addr);
	public List<Student> findByNameEndingWith(String end);
	
}
