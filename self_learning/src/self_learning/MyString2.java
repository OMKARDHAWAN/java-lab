package self_learning;

public class MyString2 {
public static void main(String[] args) {
	String str = "John";
	String str2 = str.concat("Doe");
	System.out.println("Original String str not changed even after concatination  :" + " " + str);
	System.out.println("JVM create new object which contain concat of str and new string :"+ " " +str2);
	
	
	StringBuilder str1 = new StringBuilder("Jane");
	System.out.println("Value of string : "+ " "+str1);
	str1.append("Doe");
	System.out.println("Stringbuilder is mutalble :"+ " " + str1); // string builder is mutalble; 
	
	StringBuffer Str = new StringBuffer("Peter");
	Str.append("Parkar");
	System.out.println("StringBuffer is also mutable and thread-safe :" + " " +  Str);
	 
}
}
