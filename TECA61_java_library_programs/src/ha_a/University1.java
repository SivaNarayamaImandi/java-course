package ha_a;

public class University1 {
	int uid;
	String uName;
	String state;
	public University1(int uid, String uName, String state) {
		this.uid = uid;
		this.uName = uName;
		this.state = state;
	}
	public void universityDetails()
	{
		System.out.println("UNIVERSITY DETAILS");
		System.out.println("**********--------------**********");
		System.out.println("University id : "+uid);
		System.out.println("University Name : "+uName);
		System.out.println("University State : "+state);
	}
	public void addDepatment(Department1 d)
	{
		d=new Department1(201, "Mech", "SHIV");
		System.out.println("\nDEPARTMENT DETAILS");
		System.out.println("**********--------------**********");
		System.out.println("Department id : "+d.deptId);
		System.out.println("Department Name : "+d.deptName);
		System.out.println("Department Hod : "+d.hod);
		System.out.println("\nSTUDENT DETAILS");
		System.out.println("**********--------------**********");
		Student s=new Student("Siva", 24, 78, 'M', 3);
		System.out.println("Student name : "+s.name);
		System.out.println("Student roll number : "+s.rollNo);
		System.out.println("Student section : "+s.section);
		System.out.println("Student gender : "+s.gender);
		System.out.println("Student marks : "+s.marks);
	}
}
