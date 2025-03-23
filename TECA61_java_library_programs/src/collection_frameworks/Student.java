package collection_frameworks;

public class Student {
	private String name;
	private int marks;
	private int rolNo;
	private char gender;
	private char section;

	public Student() {
	}

	public Student(String name, int marks, int rolNo, char gender, char section) {
		this.name = name;
		this.marks = marks;
		this.rolNo = rolNo;
		this.gender = gender;
		this.section = section;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getRolNo() {
		return rolNo;
	}

	public void setRolNo(int rolNo) {
		this.rolNo = rolNo;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

	public void display() {
		System.out.println(getName());
		System.out.println(getMarks());
		System.out.println(getRolNo());
		System.out.println(getGender());
		System.out.println(getSection());
	}

	public String toString() {
		return "Student Name : " + name + "Student Marks : " + marks + "Student Roll number : " + rolNo
				+ "Student Gender : " + gender + "Student Section : " + gender;
	}

}
