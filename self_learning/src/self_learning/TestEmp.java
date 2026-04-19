package self_learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.demo.model.Emp;
import com.demo.model.Employee;

public class TestEmp {
	
	public static void main(String[] args) {
		ArrayList<Emp> list = new ArrayList<>();
		list.add(new Emp(5,"Tony"));
		list.add(new Emp(1,"John"));
		list.add(new Emp(3,"Peter"));
		list.add(new Emp(2,"Jane"));
		list.add(new Emp(4,"Jack"));
		
		
		Collections.sort(list,new Emp());
		Iterator<Emp> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
