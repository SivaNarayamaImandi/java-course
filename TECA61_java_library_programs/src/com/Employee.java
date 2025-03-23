package com;

public class Employee {
//WAPFBR
	//create a clas called employee
	//delcare emp attributes are :
	//name,id,sal and loc
	//initialize the values by using constracter
	//create a method to display emp info
	//create 2 emp objects
//WAPTP Name as the usful info of 1st object
//WAPTP 2nd object info
	String name;
	int id;
	double sal;
	String loc;
	public Employee(String name,int id,double sal,String loc)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
		this.loc=loc;
	}
	public void display()
	{
		System.out.println("EMPLOYEE NAME : "+ name);
		System.out.println("EMPLOYEE ID : "+ id);
		System.out.println("EMPLOYEE SAL : "+ sal);
		System.out.println("EMPLOYEE LOCATION : "+ loc);
	}
	@Override
	public int hashCode()
	{
		return id;
	}
	@Override
	public String toString()
	{
		return name+" "+id+" "+sal+" "+loc;
	}
	public static void main(String[] args) {
		Employee employee=new Employee("SIVA", 101, 25000, "HYD");
		Employee employee1=new Employee("NARAYANA", 102, 35000, "AP");
		
		String string = employee.toString();
		employee1.display();
		System.out.println("\n"+string);
		
		int i = employee.hashCode();
		int j = employee1.hashCode();
		System.out.println(i);
		System.out.println(j);
	}
}
