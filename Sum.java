class Sum {
public static void main(String[] args){
   int sum = 0;
   int num1 = Integer.parseInt(args[0]);
   int num2 = Integer.parseInt(args[1]);
  
   sum = num1 + num2;
   System.out.println("Value of First number is :"+ " " +num1);
   System.out.println("Value of Second number is :"+ " " +num2);  
   System.out.println("Sum of the two number is :"+ " " +sum);
  
}
}