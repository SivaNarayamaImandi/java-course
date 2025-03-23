package ha_a;

public class Department {
	int deptId;
	String deptName;
	String hod;
	Student s;
	public Department(int deptId, String deptName, String hod, Student s) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.hod = hod;
		this.s = s;
	}
	public void DepartmentDetails()
	{
		System.out.println(deptId);
		System.out.println(deptName);
		System.out.println(hod);
		System.out.println(s.name);
		System.out.println(s.rollNo);
		System.out.println(s.marks);
		System.out.println(s.gender);
		System.out.println(s.section);
	}
}
