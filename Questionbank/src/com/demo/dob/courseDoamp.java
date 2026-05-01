package com.demo.dob;

import java.time.Duration;
import java.util.*;
import com.demo.model.Course;
import com.demo.model.Offline;
import com.demo.model.Online;

//public class courseDoamp  implements CourseDoa{
////static LinkedList<Course> lst;
	
//static HashMap<Integer , Course> Hmap;	
	

//static {
//	Course C1 = new Course(1,"Java",1,5000,"Activate");
//	Course C2 = new Course(3,"html",6,6000,"Activate");
//	Course C3 = new Course(2,"sde",2,7000,"Activate");
//	Hmap = new HashMap<>();
	
//	Hmap.put(C1.getCourseId(), C1);
//	Hmap.put(C2.getCourseId(), C2);
//	Hmap.put(C2.getCourseId(), C3);
//    tset = new  TreeSet<>();
//    
//    tset.add(new Course(1,"Java",1,5000,"Activate"));
//    tset.add(new Course(3,"html",6,6000,"Activate"));
//    tset.add(new Course(2,"sde",2,7000,"Activate"));
//    
//    
//}
//	@Override
//	public boolean save(int courseId,String courseName,int duaration,int fees,String status) {
//		// TODO Auto-generated method stub
//		
//		return tset.add(new Course(courseId,courseName,duaration,fees,status));
//	}
//	@Override
//	public boolean removebyid(int id) {
//		// TODO Auto-generated method stub
////				
//		
//		for(Course C : tset){
//			if(C.getCourseId() == id){
//				tset.remove(C);
//			}
//		}
//		
//		
//		return false;
//	}
//	@Override
//	public void displayAll() {
//		// TODO Auto-generated method stub
////		
//		for(Course C : tset) {
//			System.out.println(C);
//		}
//		
//		
//	}
//	@Override
//	public boolean enroll(int courseId, String courseName, int duaration, int fees, String status,String type) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		 if(type.equals("Online") && duaration == 1) {
//		    	
//		    	System.out.println("Enter Platformname");
//		    	String Platformname = sc.next();
//		    	
//
//		    	System.out.println("Enter Platformname");
//		    	String instructorname = sc.next();
//		    	
//		    	
//		    	
//		    	tset.add(new Online(courseId,courseName,duaration,fees,status,Platformname,instructorname));
//		    return true;
//		    }else if(type.equals("Offline") && duaration == 1){
//
//		    	System.out.println("Enter classroomname");
//		    	int classroomnum  = sc.nextInt();
//		    	
//
//		    	System.out.println("Enter location");
//		    	String location = sc.next();
//		    	
//		    	
//		    	
//		    	tset.add(new Offline(courseId,courseName,duaration,fees,status,classroomnum,location));
//		     return true;
//		    }
//	    return false;
//	}
//	@Override
//	public List<Course> sortByPrice() {
//		// TODO Auto-generated method stub
//		Iterator<Course> it = tset.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
//		
//		return null;
//	}
	

//}
