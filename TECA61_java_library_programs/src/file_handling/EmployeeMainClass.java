package file_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeMainClass {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Employee e =new Employee("Smith", 7892, 1500, "DALLAS");
	try
	{
		FileOutputStream fos=new FileOutputStream("Emp.txt");
		try {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e);
			oos.flush();
			FileInputStream fis=new FileInputStream("Emp.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			try {
				Employee em =(Employee) ois.readObject();
				System.out.println(em.getId());
				System.out.println(em.getName());
				System.out.println(em.getSal());
				System.out.println(em.getLoc());
			} catch (ClassNotFoundException e1) {
				System.out.println("ClassNotFoundException");
			}
		} catch (IOException e1) {
			System.out.println("Handled");
		}
		
	}
	catch(FileNotFoundException f)
	{
		System.out.println("FileNotFoundException");
	}
}
}
