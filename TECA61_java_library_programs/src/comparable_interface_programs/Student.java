package comparable_interface_programs;

public class Student implements Comparable<Student> {
	private int rollNo;
	private int marks;
	private String name;

	public Student(int rollNo, int marks, String name) {
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "\n rollNo=" + rollNo + "\n marks=" + marks + "\n name=" + name + "\n--------------------";
	}

	@Override
	public int compareTo(Student o) {
		if (this.getRollNo() > o.getRollNo()) {
			return -1;
		} else if (this.getRollNo() < o.getRollNo()) {
			return 1;
		} else {
			return 0;
		}
	}

}
