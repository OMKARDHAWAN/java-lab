package com.demo.test;

import java.io.File;
import java.io.FileNotFoundException;

public class TestFileDelete {
	public static void main(String[] args) {
		try {
			File ob = new File("Home.txt");
			if(ob.exists()) {
				if(ob.delete()) {
					System.out.println(ob.getName() + " " + "File is deleted");
				}else {
					System.out.println("File not deleted");
				}	
			}else {
				throw new FileNotFoundException("File not found");
			}
		}catch(FileNotFoundException F) {
			System.out.println(F);
		}
	}
}
