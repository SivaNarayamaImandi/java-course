package ha_a;

public class Department1 {
	int deptId;
	String deptName;
	String hod;
	public Department1(int deptId, String deptName, String hod) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.hod = hod;
	}
	public void DepartmentDetails()
	{
		System.out.println(deptId);
		System.out.println(deptName);
		System.out.println(hod);
	}
	public void studenAdmition(Student s)
	{
		s=new Student(s.name, s.rollNo, s.marks, s.gender, s.section);
		System.out.println(s.name);
		System.out.println(s.rollNo);
		System.out.println(s.marks);
		System.out.println(s.gender);
		System.out.println(s.section);
	}
}
