package tnsbatch09;
import java.sql.*;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args)throws  Exception {
		Scanner sc=new Scanner(System.in);
		String Name=sc.nextLine();  //"Akshatha Bharadwaj C";//                       
		int uid=sc.nextInt();//807/
		
        int age=sc.nextInt();
		String url="jdbc:mysql://localhost:3306/batch09";//through jdbc connect mysql then location dthen database//
		String user="root";
		String password="root123";
		String query="INSERT INTO `batch09`.`details` VALUES(?,?,?); ";
		//String query="UPDATE `batch09`.`details` SET `Name` = 'Akshatha bharadwaj C' WHERE (`uid` = '803');" ;//
		//String query="DELETE FROM `batch09`.`details` WHERE (`uid` = '800');";//
 Class.forName("com.mysql.cj.jdbc.Driver");//step2 register
 Connection con=DriverManager.getConnection(url, user, password); //step3 connection
// Statement st=con.createStatement();//step4 create statement its interface we cannt create object //
 PreparedStatement ps=con.prepareStatement(query);
 ps.setInt(1, uid);//name of column =uid of sql,uid is variable//
 ps.setString(2, Name);
 ps.setInt(3, age);
 int rs =ps.executeUpdate();//update is used for insertion//
// System.out.println("no of updated is "+rs);//
 System.out.println("no of rows updated is:"+rs);
 ps.close();
 con.close();
// ResultSet rs =st.executeQuery(query);//step5 //execute query//
 //(rs.next())//bcz in frst colunm it has pointer so we use rs.next()//
 //while(rs.next())//to print all details//
// {
//System.out.println("UID of student is :"+rs.getInt(1));//
//System.out.println("Name of the student:"+rs.getString(2));//
 }//
	}

