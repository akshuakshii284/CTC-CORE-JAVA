package tnsc2tcb09;

import tnsc2tcb09.entity.Laptop;
import tnsc2tcb09.entity.Student;
import tnsc2tcb09.service.StudentService;
import tnsc2tcb09.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Student student=new Student();
 StudentService ss=new StudentServiceImpl();
 student.setUid(2100802);
 student.setName("Akshatha");
 student.setAge(23);
 Laptop lap=new Laptop();
 lap.setLid(2);
 lap.setLname("DELL");
 student.setLaptop(lap);
 //ss.addLaptop(lap);
ss.updateLname(lap);
// ss.addStudent(student);
 
	}

}
