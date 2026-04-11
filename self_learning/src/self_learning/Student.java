package self_learning;

public class Student extends Person {
 private int rollno;

 public Student() {
	this.rollno = 0;
 }

 public Student(String name,int age,int rollno){
	 super(name,age);
	this.rollno = rollno;
 }

 public int getRollno() {
	return rollno;
 }

 public void setRollno(int rollno) {
	this.rollno = rollno;
 }

public void display() {
	 System.out.println("Name of Student: " + " " + super.getName());
	 System.out.println("Age of Student: " + " " + super.getAge());
	 System.out.println("Name of Student: " + " " + rollno);
	 System.out.println("");
}
 
 
 
}
