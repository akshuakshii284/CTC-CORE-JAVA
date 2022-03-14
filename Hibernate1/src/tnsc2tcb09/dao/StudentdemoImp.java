package tnsc2tcb09.dao;

import javax.persistence.EntityManager;

import tnsc2tcb09.entity.Laptop;
import tnsc2tcb09.entity.Student;

public class StudentdemoImp implements StudentDemo{
	EntityManager entityManager;
 public StudentdemoImp()
 {
	 entityManager=Configuration.getEntityManager();
 }
@Override
public void startTranscation() {
	// TODO Auto-generated method stub
	entityManager.getTransaction().begin();
	
}
@Override
public void endTranscation() {
	// TODO Auto-generated method stub
	entityManager.getTransaction().commit();
	
}
@Override
public void addStudent(Student student) {
	// TODO Auto-generated method stub
	entityManager.persist(student);
	
}
@Override
public void addLaptop(Laptop lap) {
	// TODO Auto-generated method stub
	entityManager.persist(lap);
}
@Override
public void updateLname(Laptop lap) {
	// TODO Auto-generated method stub
	entityManager.merge(lap);
}

}
