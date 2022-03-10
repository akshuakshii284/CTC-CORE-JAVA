package tns.c2tcbatch09.studentservice;

import tns.c2tcbatch09.dao.StudentDao;
import tns.c2tcbatch09.dao.StudentDaoImpl;
import tns.c2tcbatch09.entity.Student;

public class StudentServiceImpl implements StudentService {
	StudentDao sd;
	public StudentServiceImpl()
		{
			sd=new StudentDaoImpl();
			}
		

	@Override
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		sd.startTransaction();
		sd.addStudent(s);
		sd.endTransaction();
		
	}


	@Override
	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		sd.startTransaction();
		sd.updateStudent(s);
		sd.endTransaction();
		
	}


	@Override
	public Student getStudent(int uid) {
		// TODO Auto-generated method stub
		Student student=sd.getStudent(uid);
		return student;
	}


	@Override
	public void deleteStudent(int uid) {
		// TODO Auto-generated method stub
		sd.startTransaction();
		sd.deleteStudent(uid);
		sd.endTransaction();
		
	}


}
