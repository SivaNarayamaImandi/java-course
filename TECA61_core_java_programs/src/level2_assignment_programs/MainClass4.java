package level2_assignment_programs;

public class MainClass4 {

	public static void main(String[] args) {
		Calculator.findSquare();
		Circle c = new Circle();
		c.calculateCircumference();
	}

}
class Circle {
	public void calculateArea() {
		System.out.println("calculateArea");
	}
	public void calculateCircumference() {
		System.out.println("calculateCircumference");
		Calculator.findCube();
	}
}
class Calculator {
	public static void findSquare() {
		System.out.println("findSquare");
		Circle c = new Circle();
		c.calculateArea();
	}
	public static void findCube() {
		System.out.println("findCube");
	}
}