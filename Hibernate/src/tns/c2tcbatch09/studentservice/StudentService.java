package tns.c2tcbatch09.studentservice;

import tns.c2tcbatch09.entity.C2TC_batch09;
import tns.c2tcbatch09.entity.Student;

public interface StudentService {
	
void addStudent(Student s);

void updateStudent(Student s);

 Student getStudent(int uid);

void deleteStudent(int uid);

void updateTech_trainer(C2TC_batch09 s1);





}
