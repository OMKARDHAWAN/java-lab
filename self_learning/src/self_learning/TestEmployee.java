package self_learning;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


import com.demo.model.Employee;

public class TestEmployee {
public static void main(String[] args) {
	
	
	ArrayList<Employee> list = new ArrayList<>();
	list.add(new Employee(5,"Tony"));
	list.add(new Employee(1,"John"));
	list.add(new Employee(3,"Peter"));
	list.add(new Employee(2,"Jane"));
	list.add(new Employee(4,"Jack"));
	
	
	Collections.sort(list);
	Iterator<Employee> it = list.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	 
}
}
