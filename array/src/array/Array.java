package array;

import java.util.Scanner;

public class Array {
  public static void main(String main[]) {
	  int array[] = new int[5];
	  Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the element in array : ");
	  for(int i = 0 ; i < array.length ; i++) {
		  array[i] = sc.nextInt();
	  }
	  sc.close();
	 
	  for(int i = 0 ; i < array.length ; i++) {
		  System.out.println("Array size :" + array[i]);
	  }
	  
	 int min =  MinimumNumber.minimumNumber(array);
	 System.out.println("Minimum number in array is :" + min);
	 
	 int max =  FindMax.findmax(array);
	 System.out.println("Minimum number in array is :" + max);
	  
	 int[] sum = SumOfDigit.sum(array);
	 
	  for(int i = 0 ; i < sum.length ; i++) {
		  System.out.println("Array size :" + sum[i]);
	  }
	  
	 
	 
  }

 
}
