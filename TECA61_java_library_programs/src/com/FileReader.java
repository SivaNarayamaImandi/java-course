package com;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

public class FileReader {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		File f = new File("Abc.txt");
		try {
			java.io.FileReader fr=new java.io.FileReader("Abc.txt");
			try {
				for(int i=0;i<=f.length()-1;i++)
				{
					System.out.print((char)fr.read());
				}
				
			} catch (IOException e) {
				System.out.println("HANDLED");
			}
		} catch (FileNotFoundException e) {
			System.out.println("FILE NOT FOUND");
		}
		
	}
}
