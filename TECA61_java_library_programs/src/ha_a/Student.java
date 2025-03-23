package ha_a;

public class Student {
	String name;
	int rollNo;
	int marks;
	char gender;
	int section;
	public Student(String name, int rollNo, int marks, char gender, int section) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		this.gender = gender;
		this.section = section;
	}
	public void studentDetails()
	{
		System.out.println(name);
		System.out.println(rollNo);
		System.out.println(marks);
		System.out.println(gender);
		System.out.println(section);
	}
}
