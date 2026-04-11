package self_learning;

public  class Teacher extends Person implements TeacherInfo{
 private int TeacherId;
 private String subject;
 
 public Teacher() {
	TeacherId = 0;
	subject = "";
 }
 
 public Teacher(String name,int age,int teacherId, String subject) {
	super(name,age);
	this.TeacherId = teacherId;
	this.subject = subject;
 }


 @Override
 public void TeacherInfo() {
	// TODO Auto-generated method stub
	 System.out.println("Name of Teacher :" + " " + super.getName());
	 System.out.println("Age of Teacher : " + " " + super.getAge());
	 System.out.println("Id of Teacher :" + " " + TeacherId);
	 System.out.println("Subject teacher teach is :" + " " + subject);
	 System.out.println("");
 }
 }

 
 
 
 
 
 
 

