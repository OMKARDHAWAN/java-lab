package com.demo.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestReadFile {
public static void main(String[] args) {

	try {
		File F = new File("Home.txt");
		Scanner Reader = new Scanner(F);
		
		// Check if the file is Writable
        if (F.canRead()) {
            System.out.println("The file is Readable.");
        } else {
            System.out.println("The file is not Readable.");
        }
		
		
		while(Reader.hasNext()) {
			String data = Reader.nextLine();
			System.out.println(data);
		}
		
	}catch(FileNotFoundException F){
		System.out.println(F);
	}
	
	
}
}
