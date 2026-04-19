package self_learning;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.demo.model.Emp;
import com.demo.model.EmployeeHash;

public class TestEmployeeHash {
public static void main(String[] args) {
	Set<EmployeeHash> S = new HashSet<EmployeeHash>();
	
	S.add(new EmployeeHash(1, "John"));
	S.add(new EmployeeHash(2, "Jane"));
	S.add(new EmployeeHash(3, "Peter"));
	S.add(new EmployeeHash(4, "Jack"));
	S.add(new EmployeeHash(1, "John"));
	

	Iterator<EmployeeHash> it = S.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
}
}
