package array;

public class Array2DServieces {
// rowise sum of element
 public static int[] findRowWiseServices(int[][] arr) {
      	
      	int[] sum = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				   sum[i]=sum[i]+arr[i][j];
			}
		}
		
		return sum;
      	 
 }
 
 
 //column wise sum of element
 public static int[] findColWiseServices(int[][] arr) {
   	
   	int[] sum = new int[arr.length];
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0;j<arr.length;j++) {
				   sum[i]=sum[i]+arr[j][i];
			}
		}
		
		return sum;
   	 
}
 

 //rowwise maximum
 public static int[] findRowWiseMax(int [] [] b) {
    
	 int [] max = new int[b.length];
     
     for(int i = 0 ; i < b.length ; i ++) {
   
    	  max[i] = b[i][0];
    	 for(int j = 0 ; j < b[i].length ; j++) {
    	  	 if(b[i][j] > max[i]){
    	  		 max[i] = b[i][j];
    	  	 }
    	 }
     }
  return max;
	 
	
 }
 
 
// coloumn wise maximum
 public static int[] findColwiseMax(int[][] array) {
	 int [] max = new int[array[0].length];
	 
	 for(int i = 0 ; i < array.length ; i++) {
		 max[i] = array[0][i];
		 for(int j = 0 ; j < array.length ; j ++) {
			 if(array[j][i] > max[i]) {
				 max[i] = array[j][i];
			 }
		 }
	 }
	 
	 return max;
	 
	 
	 
	 
 }
 
 
 
 //rowwise min
 public static int[] findRowWiseMin(int[][] array){
  	 int min[] = new int[array.length];
  	 
  	 for(int i = 0 ; i < array.length ; i++){
      
  		 min[i] = array[i][0];
  		 for(int j = 0 ; j <array[i].length ; j++) {
  			if(min[i] > array[i][j]){
  			min[i] = array[i][j];	
  			}
  			}
  		
  	 }
  	 return min;
  	 
  	 
  	 
 }
 
 //colmun wise minimum
 public static int[] findColwiseMin(int [][] array) {
	 
	 int min[] = new int[array.length];
	 
	 
	 for(int i = 0 ; i < array[0].length ; i++){
		 min[i] = array[0][i];
		 for(int j = 0 ; j < array.length ; j++){
			 if( array[j][i] < min[i]) {
				 min[i] = array[j][i]; 
			 }
		 }
	 }
	 return min;
	 
 }
 
 
 
}
