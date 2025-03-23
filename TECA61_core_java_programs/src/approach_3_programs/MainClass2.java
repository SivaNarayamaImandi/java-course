package approach_3_programs;

public class MainClass2 {
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		student1.studentName="Siva";
		student2.studentName="Bhagat";
		student3.studentName="Harsha";
		student1.percentage=70;
		student2.percentage=80;
		student3.percentage=60;
		System.out.println(Student.schoolName);
		System.out.println("Student 1 Details");
		System.out.println(student1.studentName);
		System.out.println(student1.percentage+"%");
		System.out.println("Student 2 Details");
		System.out.println(student2.studentName);
		System.out.println(student2.percentage+"%");
		System.out.println("Student 3 Details");
		System.out.println(student3.studentName);
		System.out.println(student3.percentage+"%");
	}
}
