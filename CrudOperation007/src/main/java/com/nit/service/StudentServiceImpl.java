package com.nit.service;

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

}
