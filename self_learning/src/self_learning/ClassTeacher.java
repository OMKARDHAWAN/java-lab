package self_learning;

public class ClassTeacher extends Teacher {
 private String divName;

 public ClassTeacher() {
	divName = "";
 }

 public ClassTeacher(String name,int age,int teacherId, String subject,String div) {
	super(name,age, teacherId, subject);
	this.divName = div;
 }
 
 public void display() {
	 System.out.println(super.getName()+ " " +"is Class Teacher of class" + " " + divName);
	 System.out.println(" ");
 }
 
}
