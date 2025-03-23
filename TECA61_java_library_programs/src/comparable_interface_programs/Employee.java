package comparable_interface_programs;

public class Employee {
	private int id;
	private int sal;
	private String name;

	public Employee(int id, int sal, String name) {
		this.id = id;
		this.sal = sal;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "\n id=" + id + "\n sal=" + sal + "\n name=" + name + "\n------------";
	}

}
