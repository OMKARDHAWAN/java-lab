package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.demo.dao.GradeDao;
import com.demo.dao.GradeDaoImpl;
import com.demo.model.AddTask;

public class GradeServiceImpl implements GradeService {

	private GradeDao dao = new GradeServiceImpl();

	@Override
	public void execute() {
		List<Integer> numbers = dao.getNumbers();
		ExecutorService executor = Executors.newFixedThreadPool(5);
		List<Future<Integer>> futures = new ArrayList<>();
		for (int i = 0; i < numbers.size(); i += 3) {
			int a = numbers.get(i);
			int b = numbers.get(i + 1);
			int c = numbers.get(i + 2);
			AddTask task = new AddTask(a, b, c);
			Future<Integer> future = executor.submit(task);
			futures.add(future);
		}
		int totalSum = 0;

		for (Future<Integer> f : futures) {
			try {
				totalSum += f.get();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		executor.shutdown();
		System.out.println("\nFinal Sum= " + totalSum);
	}
}
