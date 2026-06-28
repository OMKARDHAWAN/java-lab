package com.demo.test;

import com.demo.model.ClassTeacher;
import com.demo.model.Person;
import com.demo.model.Student;
import com.demo.model.Teacher;

public class TestTeacher {
  public static void main(String[] args) {
   Student S = new Student("John",20,1);
   ClassTeacher T = new  ClassTeacher("Jane",40,111,"English","10th");
   T.TeacherInfo();
   T.display();
   S.display();
}
}