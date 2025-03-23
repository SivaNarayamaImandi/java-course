package default_interface;

public class EmployeeMainClass {
	public static void main(String[] args) {
		FullTimeEmp ft = new FullTimeEmp();
		System.out.println("Full Time\n");
		ft.sal();
		ft.bounus();
		System.out.println("-----------------------");
		System.out.println("Part Time\n");
		PartTimeEmp pt = new PartTimeEmp();
		pt.sal();
		System.out.println("-----------------------");
		System.out.println("Contract Time\n");
		ContractEmp ct = new ContractEmp();
		ct.sal();
	}
}
