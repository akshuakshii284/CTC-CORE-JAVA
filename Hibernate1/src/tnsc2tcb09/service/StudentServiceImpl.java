package tnsc2tcb09.service;

import tnsc2tcb09.dao.StudentDemo;
import tnsc2tcb09.dao.StudentdemoImp;
import tnsc2tcb09.entity.Laptop;
import tnsc2tcb09.entity.Student;

public class StudentServiceImpl implements StudentService  {
 StudentDemo sd;
   public StudentServiceImpl() {
	// TODO Auto-generated constructor stub
	   sd=new StudentdemoImp();

}
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		sd.startTranscation();
		sd.addStudent(student);
		sd.endTranscation();
	}
	@Override
	public void addLaptop(Laptop lap) {
		// TODO Auto-generated method stub
		sd.startTranscation();
		sd.addLaptop(lap);
		sd.endTranscation();
	}
	@Override
	public void updateLname(Laptop lap) {
		// TODO Auto-generated method stub
		sd.startTranscation();
		sd.updateLname(lap);
		sd.endTranscation();
	}
	
	
	

}
