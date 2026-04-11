package self_learning;

public abstract class Demo {
 private int StudentId;
 private String StudentName;

 public Demo() {
	StudentId = 0;
	StudentName = "";
 }

 public Demo(int studentId, String studentName) {
	
	this.StudentId = studentId;
	this.StudentName = studentName;
 }
 
 public int getStudentId() {
	return StudentId;
}

 public void setStudentId(int studentId) {
	StudentId = studentId;
 }

 public String getStudentName() {
	return StudentName;
 }

 public void setStudentName(String studentName) {
	StudentName = studentName;
 }
 
 public abstract void setRoll(int roll);
 
 public void Display() {
	 System.out.println("Id of student :" + StudentId);
	 System.out.println("Name of Student : " + StudentName);
	 System.out.println(" ");
 }
 
 
 
}
