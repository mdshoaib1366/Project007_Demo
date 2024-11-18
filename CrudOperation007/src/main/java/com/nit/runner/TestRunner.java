package com.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Student;
import com.nit.service.IStudentService;

@Component
public class TestRunner implements CommandLineRunner{

	@Autowired
	private IStudentService serv;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		try {
			Student stu = new Student();
			stu.setName("Rohit");
			stu.setAddr("Delhi");
			stu.setFee(1200d);
			serv.createAccount(stu);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
