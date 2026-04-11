package demo.com.test;

import self_learning.ClassTeacher;
import self_learning.Person;
import self_learning.Student;
import self_learning.Teacher;

public class TestTeacher {
  public static void main(String[] args) {
   Student S = new Student("John",20,1);
   ClassTeacher T = new  ClassTeacher("Jane",40,111,"English","10th");
   T.TeacherInfo();
   T.display();
   S.display();
}
}