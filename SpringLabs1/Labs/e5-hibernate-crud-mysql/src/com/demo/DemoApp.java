package com.demo;

import com.demo.entity.Sponsor;
import com.demo.service.SponsorService;
import com.demo.service.SponsorServiceImpl;

public class DemoApp {
public static void main(String[] args) {
	SponsorService service = new SponsorServiceImpl();
	//Does Not Exist
	Sponsor student = null;
	//New
	student = new Sponsor();
	student.setStudentId(200);
	student.setName("Sachin");
	
	//look inside the StudentDAOImpl for managed state
	service.addStudent(student);
	

//	student = service.findStudentById(100);
//	System.out.print("ID:"+student.getStudentId());
//	System.out.println(" Name:"+student.getName());	
//	student.setName("Sachin Tendulkar");
//	service.updateStudent(student);
	
	//at this breakpoint, we have updated record added in first section
//	student = service.findStudentById(100);
//	System.out.print("ID:"+student.getStudentId());
//	System.out.println(" Name:"+student.getName());
	
//	//at this breakpoint, record is removed from table
//	service.removeStudent(student);
	System.out.println("End of program...");
}
}
