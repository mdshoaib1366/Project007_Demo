package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Student;
import com.nit.repository.IStudentRepo;

@Service("serv")
public class StudentServiceImpl implements IStudent {

	@Autowired
	private IStudentRepo repo;
	
	@Override
	public String createAccount(Student stu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> showAllDatails() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStudent(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudentById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
