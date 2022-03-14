package tnsc2tcb09.dao;

import tnsc2tcb09.entity.Laptop;
import tnsc2tcb09.entity.Student;

public interface StudentDemo {

	void startTranscation();
	void endTranscation();

	void addStudent(Student student);
	void addLaptop(Laptop lap);
	void updateLname(Laptop lap);

}
