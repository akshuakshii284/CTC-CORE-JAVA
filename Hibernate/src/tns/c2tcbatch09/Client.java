package tns.c2tcbatch09;

import java.util.Scanner;

import tns.c2tcbatch09.entity.C2TC_batch09;
import tns.c2tcbatch09.entity.Student;
import tns.c2tcbatch09.studentservice.StudentService;
import tns.c2tcbatch09.studentservice.StudentServiceImpl;



public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService ss=new StudentServiceImpl();
		//Student s=new Student();
		//s.setUid(214);
		//s.setName("akshatha bharadwaj");
		//s.setAge(24);
		//ss.addStudent(s);//
		//ss.updateStudent(s);//
		// Scanner sc=new Scanner(System.in);//
		// String Name=sc.nextLine();//
		// String tech_trainer=sc.nextLine();//
		// String softskill_trainer=sc.nextLine();//
		// int uid=sc.nextInt();//
	    //  int age=sc.nextInt();//
		//Student student= ss.getStudent(uid);//presents uid n name//
    // System.out.println("the person is added");
		//ss.deleteStudent// 
	    C2TC_batch09 s1=new C2TC_batch09();//using upcasting//
	    s1.setUid(217);//
	    s1.setName("harshitha");//
	    s1.setAge(24);
	    s1.setTech_trainner("Sanjana");
	    s1.setSoftskill_trainner("nitara");
	    ss.addStudent(s1);
	    //ss.deleteStudent(218);//
	    //ss.updateTech_trainer("Sanjana");
	    //System.out.println("the name updated!!");
	}

}
