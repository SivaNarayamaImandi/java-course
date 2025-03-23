package file_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("QSP.txt");
			try {
				int i = fis.available();
				byte[] b = new byte[i];
				fis.read(b);
				String s = new String(b);
				int int1 = Integer.parseInt(s);
				System.out.println(int1);
			} catch (IOException e) {
				System.out.println("handled");
			}
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		}

	}
}
