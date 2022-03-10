package tns.c2tcbatch09.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //persistence entity//
//@Table(name="details")//
public class Student {
	@Id// annotation for primary key//
private int uid;
private String name;
private int age;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Student [uid=" + uid + ", name=" + name + ", age=" + age + "]";
}

}
