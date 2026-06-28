package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

public class AddTaskDaoImp implements NumberDao {
	@Override
	public List<Integer> getNumbers() {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 51; i++) {
			list.add(i);
		}
		return list;
	}
}
