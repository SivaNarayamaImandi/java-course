package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		File f = new File("Abc.txt");
		try {
			boolean res = f.createNewFile();
			System.out.println(res);
			FileWriter fw = new FileWriter(f);
			fw.write("THIS IS FILE WRITER");
			fw.flush();
			fw.close();
			System.out.println("DATA STORED");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
