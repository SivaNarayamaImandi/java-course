package collection_frameworks;

import java.util.ArrayList;

public class StudentMainClass {
	public static void main(String[] args) {
		Student s1 = new Student("TOM", 72, 12, 'M', 'A');
		Student s2 = new Student("JERRY", 92, 10, 'M', 'B');
		Student s3 = new Student("DOG", 62, 5, 'M', 'C');
		Student s4 = new Student("DUCK", 82, 6, 'F', 'D');

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println("CREATE QUERY");
		System.out.println();
		for (Student student : al) {
			if (student.getMarks() > 70)
				System.out.println("STUDENT " + student.getName() + " MARKS  : " + student.getMarks());
		}
		System.out.println("------------------------");
		System.out.println("READ QUERY");
		System.out.println();
		for (Student student : al) {
			if (student.getSection() == 'A')
				System.out.println(
						"STUDENT NAME : " + student.getName() + "\n" + "STUDENT ROLL NUMBER : " + student.getRolNo());
		}
		System.out.println("------------------------");
		System.out.println("UPDATE QUERY");
		System.out.println();
		for (Student student : al) {
			if (student.getRolNo() == 5) {
				student.setMarks(85);
				System.out.println("STUDENT MARKS : " + student.getMarks());
			}
		}
		System.out.println("------------------------");

	}
}
