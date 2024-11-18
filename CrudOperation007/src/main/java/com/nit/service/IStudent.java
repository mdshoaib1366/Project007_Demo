package com.nit.service;

import java.util.List;

import com.nit.entity.Student;

public interface IStudent {

	public String createAccount(Student stu) throws Exception;
	public List<Student> showAllDatails() throws Exception;
	public Student getStudentByName(String name) throws Exception;
	public String updateStudent(Integer id) throws Exception;
	public String deleteStudentById(Integer id) throws Exception;
}
