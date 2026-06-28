package com.demo.test;

import com.demo.service.GradeService;
import com.demo.service.GradeServiceImpl;

public class TestGrade {

	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		service.execute();

	}

}
