package array;

import java.util.Scanner;

public class array2 {
	public static void main(String[] args){
	 	int [][] array = new int[3][];
	 	
	    ArrayService.acceptData(array);
	    ArrayService.displayData(array);
	   int[] rowwisemin = ArrayService.rowwisemin(array);
	   for(int i = 0 ; i < rowwisemin.length ; i++) {
		   System.out.println("Row wise Minimum "+ rowwisemin[i]);
	   }
}  
	}
