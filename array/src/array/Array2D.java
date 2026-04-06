package array;

import java.util.Scanner;

public class Array2D {
  public static void main(String[] args){
	  int [][] array3 = new int [2][2];
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter Element in array :");
	  
	  for(int i = 0 ; i < array3.length ; i++) {
		  for(int j = 0 ; j < array3[i].length ; j++) {
			  array3[i][j] = sc.nextInt();
		  }
	  }
	  
	  System.out.println("Element of array :");
	  for(int i = 0 ; i < array3.length ; i++) {
		  for(int j = 0 ; j < array3[i].length ; j++) {
			  System.out.print(array3[i][j] + " ");
		  }
		  System.out.println(" ");
	  }
	  

	  System.out.println("Rowwise traversing of array :");
	  for(int i = 0 ; i < array3.length ; i++) {
		  for(int j = 0 ; j < array3[i].length ; j++) {
			  System.out.print(array3[i][j] + " ");
		  }
	  };
	  System.out.println(" ");
	  
	  
	  System.out.println("Column wise traversing of array :");
	  for(int i = 0 ; i < array3[0].length ; i++) {
		  for(int j = 0 ; j < array3.length ; j++) {
			  System.out.print(array3[j][i] + " ");
		  }
	  }
	  System.out.println(" "); 
	  
	  int[] max = Array2DServieces.findRowWiseMax(array3);
	  
	  System.out.println("Max element of array rowwise  :");
	 for(int i = 0 ; i < max.length ; i++) {
			System.out.print(max[i] + " ");
		} 
	  System.out.println(" ");
	  System.out.println(" ");
	  
		  int[] colmax = Array2DServieces.findColwiseMax(array3);
		  
		  System.out.println("Max element of array colwis is :");
			 for(int i = 0 ; i < colmax.length ; i++) {
				System.out.print(colmax[i] + " ");
			} 
			  System.out.println(" ");		  
			  System.out.println(" ");
			  
			 int[] rowmin = Array2DServieces.findRowWiseMin(array3);
		  
			  System.out.println("min element of array rowwis is :");
				 for(int i = 0 ; i < rowmin.length ; i++) {
					System.out.print(rowmin[i] + " ");
			 } 
				System.out.println(" ");
				 System.out.println(" ");
				 
				 int[] colmin = Array2DServieces.findColwiseMin(array3);
				  
				  System.out.println("min element of array colwise	 is :");
					 
				  for(int i = 0 ; i < colmin.length ; i++) {
						System.out.print(colmin[i] + " ");
				  }
				  System.out.println(" ");
				  System.out.println(" ");
				  
				  int[] rowsum = Array2DServieces.findRowWiseServices(array3);
	     System.out.println("Sum of element of array rowwsie is :");
	      for(int i = 0 ; i < rowsum.length ; i++) {
		     System.out.print(rowsum[i] + " ");
	      }
		  System.out.println(" ");
		  System.out.println(" ");
		  
		  int[] colsum = Array2DServieces.findRowWiseServices(array3);
		System.out.println("Sum of element of array colwise is :");
		 for(int i = 0 ; i < colsum.length ; i++) {
			System.out.print(colsum[i] + " ");
		}
		  System.out.println(" ");
		  System.out.println(" ");
  }
}
