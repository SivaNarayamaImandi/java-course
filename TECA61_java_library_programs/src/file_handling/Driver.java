package file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class Driver {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("jsp.txt");
			fw.write("THIS IS FILE WRITER");
			fw.flush();
			fw.close();
			System.out.println("DATA STORED.........");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
