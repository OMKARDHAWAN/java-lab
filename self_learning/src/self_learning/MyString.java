package self_learning;

import java.util.regex.Pattern;

public class MyString {
 public static void main(String[] args) {
	String name = "John hary Doe";
	String name1 = "    JANE DOE";
    String pattern = " ";
	System.out.println("Length of the name is :" +" "+name.length());
	System.out.println("Substring of string : " + name.substring(1,3));
	String[] Name = name.split(pattern);
	for(String s :Name) {
		System.out.println(s);
	}
	System.out.println("Uppercase:" + name.toUpperCase());
	System.out.println("Lowercase:" + name.toLowerCase());
	System.out.println("Trim of string 1"+ " " + name.trim()) ;
	System.out.println("index of character h : "+ " " + name.indexOf("h")) ;
	System.out.println("Last index of character h : "+ " " + name.lastIndexOf("h")) ;
}
}
