package com.demo.dao;

import java.util.List;



public interface ProductDao {

	List<Product> readFile();

	void writeFile(List<Product> sharedList);

}
