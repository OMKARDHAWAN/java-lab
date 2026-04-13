package com.demo.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
public class TestBuffered {
	public static void main(String[] args) {
	
	try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("data.txt"))) {
		String data = " Helloworld!!!!";
		byte B[] = data.getBytes();
		
		
		bos.write(B);
		
		
		
		
		
	}catch(FileNotFoundException f) {
		System.out.println(f);
	}catch(IOException E) {
		System.out.println(E);
	}
	
	
	try(BufferedInputStream bin = new BufferedInputStream(new FileInputStream("File.txt"))){
		int byteData;
		while((byteData = bin.read()) != -1) {
			System.out.println((char)byteData);
		}
	}catch( FileNotFoundException F) {
		System.out.println(F);
	}catch(IOException E) {
		
	}
	
	
	
}
}