package com.nit.service;

import java.util.List;
import java.util.Optional;

import com.nit.entity.Student;

public interface IStudentService {

	public String createAccount(Student stu) throws Exception;
	public List<Student> showAllDatails() throws Exception;
	public Optional<Student> getStudentByName(String name) throws Exception;
	public String updateStudent(Integer id) throws Exception;
	public String deleteStudentById(Integer id) throws Exception;
	public List<Student> getStudentLessThanByFee(double fee) throws Exception;
}
