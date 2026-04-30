package com.demo.test;

import java.util.HashSet;

public class TestLongSub {
	public static int FindLong(String S) {
		
		  HashSet<Character> Str = new HashSet<>();
			
				int left=0;
				int maxlength = 0;
				
				for(int right = 0 ; right < S.length() ; right++){
					
					while(Str.contains(S.charAt(right))){
						Str.remove(S.charAt(left));
						left++;
					}
					
					
					
					Str.add(S.charAt(right));
					maxlength = Math.max(maxlength, right - left + 1);
					
				}
		return maxlength;
		
		
	}
	
public static void main(String[] args) {
	String S ="abcabcbb";
	
    System.out.println(FindLong(S));	

}
}