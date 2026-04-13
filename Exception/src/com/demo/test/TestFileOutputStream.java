package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
public static void main(String[] args) {
	 try {
		 FileOutputStream fout = new FileOutputStream("File.txt");
		 String data = "Hello";
		 
		 byte[] dataBytes = data.getBytes();
		 
		 fout.write(dataBytes);
		 
		 System.out.println("File uploded Succesfully!!!");
		 
		 throw new FileNotFoundException("File not found!!");
		 
	 }catch(FileNotFoundException F) {
		 System.out.println(F);
	 }catch(IOException E) {
		 System.out.println(E);
	 }finally{
        System.out.println("finally block is executed!!!");
	 }
}
}
