package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) {
		File f = new File("Abc.pdf");
		try {
			boolean b = f.createNewFile();
			System.out.println(b);
			FileWriter fw = new FileWriter(f);
			fw.write("THIS IS FILE WRITER");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
