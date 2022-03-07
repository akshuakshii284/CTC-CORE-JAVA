
import java.sql.*;

public class StudentDao {

	public void addStudent(Student s) throws Exception{
	
		String url="jdbc:mysql://localhost:3306/batch09";//through jdbc connect mysql then location dthen database//
		String user="root";
		String password="root123";
		String query="INSERT INTO `batch09`.`details` VALUES(?,?,?); ";
		Connection con=DriverManager.getConnection(url,user,password);
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1, s.getUID());
		st.setString(2, s.getName());
		st.setInt(3, s.getAge());
		int rs=st.executeUpdate();
		System.out.println("No of rows updated is "+rs);
		st.close();
		con.close();


		
	}

}
