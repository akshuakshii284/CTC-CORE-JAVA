package tns.c2tcbatch09;

import java.util.Scanner;

import tns.c2tcbatch09.entity.Student;
import tns.c2tcbatch09.studentservice.StudentService;
import tns.c2tcbatch09.studentservice.StudentServiceImpl;



public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService ss=new StudentServiceImpl();
		Student s=new Student();
		//s.setUid(214);//
		//s.setName("akshatha bharadwaj");
		//s.setAge(24);
		//ss.addStudent(s);//
		//ss.updateStudent(s);//
		 Scanner sc=new Scanner(System.in);
		// String Name=sc.nextLine();//
		 int uid=sc.nextInt();
	    //int age=sc.nextInt();//
		//Student student= ss.getStudent(uid);//presents uid n name//
     System.out.println("the person is removed");
		ss.deleteStudent(uid);
	}

}
