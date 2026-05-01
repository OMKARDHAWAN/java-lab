package com.demo.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class TestArray {
public static void main(String[] args) {
	String Str ="";
	Scanner sc = new Scanner(System.in);
	LinkedList<String> list = new LinkedList<>();
	ArrayList<String> list2 = new ArrayList<>();
	ArrayList<String> list3 = new ArrayList<>();
	Stack<String> st = new Stack<>();
	
	
	System.out.println("Enter 5 String :");
	
	for(int i = 0 ; i < 5 ; i++){
		Str = sc.next(); 
		st.push(Str);
		
	}
	
	for(String S : st) {
		
		
		boolean status = isrepeated(S);
		if(status){
			list2.add(S);
		}
		
	   }
	
	
	
			Iterator<String> it1 = list2.iterator();
	
	
	
	
	
System.out.println("String in list 2:");
			while(it1.hasNext()) {
				System.out.println(it1.next());
			}

			

			Iterator<String> it3 = list3.iterator();
	
			
			System.out.println("String in list 3:");		
			while(it3.hasNext()) {
				System.out.println(it3.next());
			}
		try {
			
			File file = new File("C:\\Users\\dhawa\\eclipse-workspace\\Questionbank\\src\\small.txt");
            FileWriter fw = new FileWriter(file);
		 
            
            for(String data : list3){
            	fw.write(data);
            }
            
            
        	fw.close();
            
		} catch (IOException O) {
			// TODO: handle exception
			System.out.println(O);
		}
		
		
		
		
		
		
	};
	
	
	public static boolean isPalindrome(String S) {
		int left = 0;
		int right = S.length() - 1;
		
		while(left < right) {
			if(S.charAt(left) != S.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		
		
		return true;
		
		
	}
	
	public static boolean isCheck(String S){
		
		
		
		int first = S.charAt(0);
		int last = S.charAt(S.length() - 1);
		
		if(first == last) {
			return true;			
		}
		
		return false;
		
		
	}
	
	public static boolean isDigit(String S) {
	    
		for(char ch : S.toCharArray()) {
			if(!Character.isDigit(ch)) {
			 return false;	
			}
		}
		
		return true;	
	}
	
	public static boolean isrepeated(String S){
		
		Set<Character> hset = new HashSet<>();
		
		for(char ch : S.toCharArray()) {
			
			if(hset.contains(ch)){
				return true;
			}
				
			hset.add(ch);
		}
		
		
		
		
		return false;
	}
	
}

