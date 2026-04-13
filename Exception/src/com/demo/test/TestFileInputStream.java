package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {
 public static void main(String[] args) throws IOException {
	 try {
		 
		 FileInputStream fi = new FileInputStream("File.txt");
		 
		 System.out.println("File channel :" + fi.getChannel());
		 System.out.println("File descriptor :" + fi.getFD());
		 System.out.println("Number of remaining bytes :" + fi.available());
		 
		 int s;
		 while((s = fi.read()) != -1) {
			 System.out.println((char)s);
		 }
		 
		 
		 throw new FileNotFoundException("File not found!!");
	 }catch(FileNotFoundException F) {
		 System.out.println(F);
	 }catch(IOException e) {
		 System.out.println(e);
	 }finally {
		 System.out.println("Finally block executed!!!!");
	 }
}
}
