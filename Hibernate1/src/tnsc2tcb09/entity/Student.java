package tnsc2tcb09.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity


public class Student {
	@Id
  private int uid;
  private String Name;
  private int age;
  @OneToOne //one student has one laptop//
   private Laptop laptop;//because laptop has its own configuration..
public Laptop getLaptop() {
	return laptop;
}
public void setLaptop(Laptop laptop) {
	this.laptop = laptop;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
  
}
