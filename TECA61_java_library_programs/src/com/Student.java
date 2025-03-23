package com;

public class Student {
	String name;
	int id;
	int marks;
	public Student(int id,String name,int marks)
	{
		this.id=id;
		this.marks=marks;
		this.name=name;
	}
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(marks);
	}
	@Override
	public boolean equals(Object o)
	{
		Student student1=(Student)o;
		return this.name.equals(student1.name);
	}
	@Override
	public String toString()
	{
		return name+" "+marks;
	}
	@Override
	public int hashCode()
	{
		return id;
	}
	public static void main(String[] args) {
		Student student=new Student(11, "Siva", 78);
		Student student1=new Student(12, "Otis", 87);
		
		String string = student.toString();
		System.out.println(string);
		
		boolean b = student.equals(student1);
		System.out.println(b);
		
		int i = student.hashCode();
		System.out.println(i);
		int j = student1.hashCode();
		System.out.println(j);
	}
}
