package comparable_interface_programs;

import java.util.ArrayList;
import java.util.Collections;

public class EmpMainClass {
	public static void main(String[] args) {
		Employee e1=new Employee(12, 800000, "dinga");
		Employee e2=new Employee(123, 700000, "sheela");
		Employee e3=new Employee(124, 900000, "mala");
		
		ArrayList<Employee>al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		Collections.sort(al, new EmpSortId());
		System.out.println(al);
	}
}	
