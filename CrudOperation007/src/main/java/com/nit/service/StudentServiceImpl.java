package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Student;
import com.nit.repository.IStudentRepo;

@Service("serv")
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentRepo repo;
	
	@Override
	public String createAccount(Student stu) throws Exception{
		// TODO Auto-generated method stub
		Student save = repo.save(stu);
		Integer roll = save.getRoll();
		if(roll!=null) {
			return "Account Created By Roll Number:: " + roll;
		}
		
		return "Account Not Created";
	}

	@Override
	public List<Student> showAllDatails() throws Exception {
		// TODO Auto-generated method stub
		
		List<Student> all = repo.findAll();
		return all;
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
		Student student = repo.findById(id).get();
		if(student.getRoll().equals(id)) {
			repo.deleteById(id);
			return "delete student...";
		}
		else
			return "Roll Not found";
			
	}

}
