package tns.c2tcbatch09.dao;

import tns.c2tcbatch09.entity.Student;

public interface StudentDao {

	void addStudent(Student s);

	void startTransaction();

	void endTransaction();

	void updateStudent(Student s);

	Student getStudent(int uid);

	void deleteStudent(int uid);

}
