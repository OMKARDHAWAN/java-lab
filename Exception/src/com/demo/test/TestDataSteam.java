package com.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataSteam {
   public static void main(String[] args) {
	   File nfile = new File("output.txt");
	  
	try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(nfile))) {
		int n = 160;
        dos.writeInt(n);
        dos.writeBytes("Hello");
        
		
	}catch(FileNotFoundException F) {
		System.out.println(F);
	}
	catch (IOException e) {
		// TODO: handle exception
	e.printStackTrace();
	}
	
	//to read data using DataFileinputStream
	try(DataInputStream din = new DataInputStream(new FileInputStream("output.txt")))
	{
		int n = din.readInt();
		String word = din.readLine();
		
		while(n != -1) {
			System.out.println(n);
			System.out.println(word);
		}
	}catch(FileNotFoundException F) {
		System.out.println(F);
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}
