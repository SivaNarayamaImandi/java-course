package file_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentMainClass {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Student s = new Student("SIVA", 2345);
		try
		{
			FileOutputStream fos = new FileOutputStream("stu.txt");
			try {
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(s);
				oos.flush();
				FileInputStream fis=new FileInputStream("stu.txt");
				ObjectInputStream ois =new ObjectInputStream(fis);
				try {
					Student stu=(Student)ois.readObject();
					System.out.println(stu.getName());
					System.out.println(stu.getId());
				} catch (ClassNotFoundException e) {
					System.out.println("ClassNotFoundException");
				}
			} catch (IOException e) {
				System.out.println("Handled");
			}
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("FILE NOT FOUND");
		}
	}
}
