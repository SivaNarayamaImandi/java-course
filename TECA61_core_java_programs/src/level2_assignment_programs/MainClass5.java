package level2_assignment_programs;

public class MainClass5 {

	public static void main(String[] args) {
		Student s = new Student();
		s.takeExam();
	}

}
class Student{
	public void takeExam() {
		System.out.println("takeExam");
		Classroom.calculateAverageScore();
	}
	public void submitAssignment() {
		System.out.println("submitAssignment");
	}
}
class Classroom{
	public static void calculateAverageScore() {
		System.out.println("calculateAverageScore");
		Student s = new Student();
		s.submitAssignment();
	}
	public static void conductDiscussion() {
		System.out.println("conductDiscussion");
	}
}