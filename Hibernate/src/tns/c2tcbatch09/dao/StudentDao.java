package tns.c2tcbatch09.dao;

import tns.c2tcbatch09.entity.Student;

public interface StudentDao {

	void addStudent(Student s);

	void startTransaction();

	void endTransaction();



	Student getStudent(int uid);

	void deleteStudent(int uid);

	void updateTech_trainer(String s1);

	void updateStudent(Student s);

}
