package file_handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("QSP.txt");
			String s = "1234567890";
			byte[] bs = s.getBytes();
			try {
				fos.write(bs);
				fos.flush();
				fos.close();
				System.out.println("Data stored");
			} catch (IOException e) {
				System.out.println("hendled");
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

	}
}
