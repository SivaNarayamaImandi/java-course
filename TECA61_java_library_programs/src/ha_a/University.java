package ha_a;

public class University {
	int uid;
	String uName;
	String state;
	Department d;
	public University(int uid, String uName, String state, Department d) {
		this.uid = uid;
		this.uName = uName;
		this.state = state;
		this.d = d;
	}
	public void universityDetails()
	{
		System.out.println("UNIVERSITY DETAILS");
		System.out.println("**********--------------**********");
		System.out.println("University id : "+uid);
		System.out.println("University Name : "+uName);
		System.out.println("University State : "+state);
		System.out.println("\nDEPARTMENT DETAILS");
		System.out.println("**********--------------**********");
		System.out.println("Department id : "+d.deptId);
		System.out.println("Department Name : "+d.deptName);
		System.out.println("Department Hod : "+d.hod);
		System.out.println("\nSTUDENT DETAILS");
		System.out.println("**********--------------**********");
		System.out.println("Student name : "+d.s.name);
		System.out.println("Student roll number : "+d.s.rollNo);
		System.out.println("Student section : "+d.s.section);
		System.out.println("Student gender : "+d.s.gender);
		System.out.println("Student marks : "+d.s.marks);
	}
}
