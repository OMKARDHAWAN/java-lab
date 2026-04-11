package self_learning;

public class Demo2 extends Demo {
 private int rollno;
 public Demo2(){
	 rollno = 0;
 }

 public Demo2(int id , String name,int rollno) {
	 super(id,name);
	 this.rollno = rollno;
 }
 
 @Override
 public void setRoll(int roll) {
	// TODO Auto-generated method stub
	this.rollno = roll;
 }
 
 
 public void Display() {
	 System.out.println("Id of student :" + super.getStudentId());
	 System.out.println("Name of Student : " + super.getStudentName());
	 System.out.println("Roll no of student :" + rollno);
	 System.out.println();
 }
 
 
}
