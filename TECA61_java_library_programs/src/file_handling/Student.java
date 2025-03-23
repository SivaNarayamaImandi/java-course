package file_handling;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable {
	private transient String name;
	private int id;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void display() {
		System.out.println(getName());
		System.out.println(getId());
	}
}
