package tns.c2tcbatch09.dao;

import javax.persistence.EntityManager;

import tns.c2tcbatch09.entity.Student;

public class StudentDaoImpl implements StudentDao {
EntityManager entityManager;//talk to the database//
public StudentDaoImpl()
{
	entityManager=Configuration.getEntityManager();
}
@Override
public void addStudent(Student s)
{   entityManager.persist(s);
}
@Override
public void startTransaction() {
	// TODO Auto-generated method stub
	entityManager.getTransaction().begin();
	
}
@Override
public void endTransaction() {
	// TODO Auto-generated method stub
	entityManager.getTransaction().commit();
	
}
@Override
public void updateStudent(Student s) {
	// TODO Auto-generated method stub
	entityManager.merge(s);
}
@Override
public Student getStudent(int uid) {
	// TODO Auto-generated method stub
	Student student=entityManager.find(Student.class, uid);
	return student;
}
@Override
public void deleteStudent(int uid) {
	// TODO Auto-generated method stub
	Student s1=entityManager.find(Student.class, uid);
	entityManager.remove(s1);
}
}
