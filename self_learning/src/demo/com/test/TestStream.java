package demo.com.test;

import java.util.List;
import java.util.Arrays;

public class TestStream {
public static void main(String[] args) {
	List <Integer> list = Arrays.asList(30,10,50,40,20);	
	List <Integer> filteRes = list.stream().filter(x -> x < 30).toList();
	List <Integer> Sorted = list.stream().sorted().toList();
	
	long Count = list.stream().count();
	int sum = list.stream().reduce(0,(a,b)-> a + b);
    
	System.out.println(filteRes);
    System.out.println(Sorted);
    System.out.println(Count);
    System.out.println(sum);
}
}
