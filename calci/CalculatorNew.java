class CalculatorNew{
 public static void main(String[] args){
 int len = args.length;
  
 int num1 = Integer.parseInt(args[1]);
 int num2 = Integer.parseInt(args[2]);
 int sum = 0;
 

switch(args[0]){
 case "+"->{ 
 sum = num1 + num2;
 System.out.println("Addition of two number :" + sum);

}
 case "-"->{
 sum = num1 - num2;
 System.out.println("Substraction of two number :" + sum);

}
 case "x"->{
 sum = num1 * num2;
 System.out.println("Multiplication of two number :" + sum);

}
 case "/"->{
 sum = num1 / num2;
 System.out.println("Divide of two number :" + sum);
}

}
}
}