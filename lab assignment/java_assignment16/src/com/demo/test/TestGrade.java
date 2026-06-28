package com.demo.test;


import com.demo.service.GradeServiceImpl;
import com.demo.service.GreadeService;

public class TestGrade {

	public static void main(String[] args) {
		GreadeService service = new GradeServiceImpl();
		service.execute();

	}

}
