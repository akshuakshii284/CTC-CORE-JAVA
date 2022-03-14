package tnsc2tcb09.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
  @Id
  private int lid;
  private String lname;
  @OneToOne(mappedBy = "laptop")//bidirection but dont not mention details two times //
  Student student;//inoder laptop need to access the attributes of student we need to decleare object//
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
  
	

}
