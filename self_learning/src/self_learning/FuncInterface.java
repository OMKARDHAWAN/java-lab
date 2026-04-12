package self_learning;

@FunctionalInterface
interface Animal{
	 void add(int a , int b);
}



public class FuncInterface {
 public static void main(String[] args) {
	

	 
	 Animal obj = (a,b) -> {		 
		 int res = a + b;
		 System.out.println("Functional interface executed!!!" + " " + "addition of a and b :" + res);
	 };
	 obj.add(10,20);
}
}

