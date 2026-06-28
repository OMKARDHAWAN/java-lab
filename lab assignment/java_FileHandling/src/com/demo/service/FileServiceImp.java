package com.demo.service;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.demo.dao.FileServiceDao;
import com.demo.dao.FileServiceDaoImp;
//import com.demo.dao.Q11_12_13_14_Dao;
//import com.demo.dao.Q11_12_13_14_DaoImpl;
import com.demo.model.FileStudent;


public class FileServiceImp implements FileService{
	FileServiceDao dao= new FileServiceDaoImp();
	Scanner sc=new Scanner(System.in);

	@Override
	public void add() {
		System.out.print("ID: ");
        int id = sc.nextInt(); sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Degree: ");
        String degree = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();
		
        FileStudent s= new FileStudent(id, name, degree, email);
        
        dao.save(s);
	}
	
	

    public void displayAll() {
        dao.getAll().forEach(System.out::println);
    }

    // Q11
    public void saveCSV() {
        dao.writeToFile();
    }

    // Q12
    public void loadCSV() {
        dao.loadCSV().forEach(System.out::println);
    }

    // Q13
    public void saveObject() {
        dao.writeObject();
    }

    // Q14
    public void loadObject() {
        dao.readFile().forEach(System.out::println);
    }

	

	

	




	
}
