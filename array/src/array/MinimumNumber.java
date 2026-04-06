package array;

public class MinimumNumber {
	
 public static int minimumNumber (int [] array){
	 int min = array[0];
	 for(int i = 0 ; i <array.length ; i++) {
		 if(min > array[i]) {
			min = array[i];
		 }
	 }
	 return min;
 }
}
