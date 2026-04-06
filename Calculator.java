class Calculator{
 public static void main(String[] args){
 int len = args.length;
  
 int num1 = Integer.parseInt(args[1]);
 int num2 = Integer.parseInt(args[2]);
 int sum = 0;
 
if(len < 3){
 System.out.println("Please Enter atleast 3 Parameter!!! ");  
}

switch(args[0]){
 case "+": 
 sum = num1 + num2;
 System.out.println("Addition of two number :" + sum);
 break;

 case "-":
 sum = num1 - num2;
 System.out.println("Substraction of two number :" + sum);
 break; 

 case "x":
 sum = num1 * num2;
 System.out.println("Multiplication of two number :" + sum);
 break; 

 case "/":
 sum = num1 / num2;
 System.out.println("Divide of two number :" + sum);
 break; 

 default :
 System.out.println("Please Enter atleast 3 Parameter: ");
}


}
}