package com.nit.runner;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Student;
import com.nit.service.IStudentService;


@Component
public class TestRunner implements CommandLineRunner{

	@Autowired
	private IStudentService serv;
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void run(String... args) throws Exception {
		
		
		while(true) {
			System.out.println("Choose Option==== ");
			System.out.println("1) Create Account:: \n" + 
			"2) Show All Details:: \n" + 
					"3) detete Student details:: \n"+
					"4) Show By Name:: \n"+
					"5) Fee By Less Than:: \n"+
					"6) Exit");
			
			// TODO Auto-generated method stub
			int choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1:
				try {
					Student stu = new Student();
					stu.setName("Pooja");
					stu.setAddr("Hyd");
					stu.setFee(1300d);
					String result = serv.createAccount(stu);
					System.out.println(result);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				
				try {
					List<Student> stu = serv.showAllDatails();
					stu.forEach(System.out::println);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					System.out.println("Enter the roll:: ");
					Integer id = Integer.parseInt(sc.nextLine());
					String res = serv.deleteStudentById(id);
					System.out.println(res);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			case 4:
				try {
					System.out.println("Enter Name;");
					String name = sc.nextLine();
					Optional<Student> student = serv.getStudentByName(name);
					System.out.println(student.toString());
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
				
			case 5:
				try {
					System.out.println("Enter Fee;");
					double fee = Double.parseDouble(sc.nextLine());
					List<Student> li = serv.getStudentLessThanByFee(fee);
					
					li.forEach(x->System.out.println(x));
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 6:
				System.out.println("Thanks For Using My Application");
				System.exit(0);
			default:
				System.err.println("Invalid Option");
				
			}

		}
				
		
	}

}
