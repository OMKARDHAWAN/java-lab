package array;

import java.util.Scanner;

public class ArrayService {
 public static void acceptData(int[][] arr){
	Scanner sc = new Scanner(System.in);
	

	
	for(int i = 0 ; i < arr.length ; i++) {
	  System.out.println("Enter number of col :");
	  int col = sc.nextInt();
	  arr[i] = new int[col];
	  
	  for(int j = 0 ; j < col ; j++) {
		  System.out.println("Enter num at row :" + " " + i + " " + "Column : " + " " + j);
		  arr[i][j] = sc.nextInt();	  
		  
	  }
	}
	
 }
 
 
 public static void displayData(int[][]arr){
	 System.out.println("Enter the element : ");
	 for(int i = 0 ; i < arr.length ; i++){
        for(int j = 0 ; j < arr[i].length ; j++) {
        	System.out.print(arr[i][j] + " ");
        }
        System.out.println(" ");
	 }
	
 }



public static int[] rowwisemin(int [][] arr){
	int min[] = new int[arr.length];
	for(int i = 0 ; i < arr.length ; i++) {
		min[i] = arr[i][0];
		for(int j = 0 ; j < arr[i].length ; j++) {
			if(min[i] > arr[i][j]) {
				min[i] = arr[i][j]; 
			}
		}
	}
	return min;
}


}