package comparable_interface_programs;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student(101, 87, "Ram");
		Student s2 = new Student(107, 97, "Sitha");
		Student s3 = new Student(104, 67, "Bhantu");
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Collections.sort(al);
		System.out.println(al);
	}
}
