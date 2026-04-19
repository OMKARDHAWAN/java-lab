package self_learning;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
public static void main(String[] args) {
	Queue<Integer> q = new LinkedList<Integer>();
	
	q.add(50);
	q.add(10);
	q.add(40);
	q.add(60);
	q.add(20);
	
	
	Iterator<Integer> it = q.iterator(); 
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	
}
}
