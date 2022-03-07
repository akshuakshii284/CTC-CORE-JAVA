


public class Client {

	public static void main(String[] args) throws Exception {
		Student s=new Student();
		s.setUID(624);
		s.setName("Ramu");
		s.setAge(8);
		StudentDao sd=new StudentDao();
		sd.addStudent(s);

	}

}