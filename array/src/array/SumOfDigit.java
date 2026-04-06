package array;

public class SumOfDigit {
	
	
private static int getAddition(int num) {
	      int addition=0;
	      while(num>0) {
			      int d=num%10;         // 456  6   5   4  
			       num=num/10;      //45   4     0
			      addition+=d;
	      }
	      return addition;
}
	
  public static int[] sum(int[] array2){
	  int [] array3 = new int[array2.length];
	  int addition = 0;
	  for(int i = 0 ; i <array3.length; i++) {
//		  System.out.println()
		  array3[i] = getAddition(array2[i]);
		  addition += array3[i];
		  System.out.println("Sum of array :" + addition);
	  }
	  return array3;
  }
}
