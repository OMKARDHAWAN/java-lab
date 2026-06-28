package com.demo.test;

import com.demo.service.ProducerServiceImpl;
import com.demo.service.ProducerService;

public class TestProducer {

	public static void main(String[] args) {
		ProducerService service = new ProducerServiceImpl();
	        service.execute();

	}

}
