package com.demo.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.FileStudent;



public class FileServiceDaoImp implements FileServiceDao{

	List<FileStudent> list = new ArrayList<>();
	private String cssvFile = "student.csv";
    private String filename = "student.dat";

	@Override
	public void save(FileStudent s) {
		list.add(s);
		
	}
	
	@Override
	public List<FileStudent> getAll() {
		return list;
	}
	
	//------------------//Question 11//---------------------//
	@Override
	public void writeToFile() {
		try {
			BufferedWriter bfw=new BufferedWriter(new FileWriter(cssvFile));
			for(FileStudent S:list) {
				bfw.write(S.toString());
				bfw.newLine();
			}
			System.out.println("Written to File"+cssvFile);
		}catch(IOException e){
			System.out.println("Error.......");
		}
		
	}

	//--------------------//Question 12//---------------------------//
	@Override
	public List<FileStudent> loadCSV() {
        List<FileStudent> temp=new ArrayList<>();
        try(BufferedReader br=new BufferedReader(new FileReader(cssvFile))) {
            String line;
            while((line=br.readLine())!=null) {
                String[] arr=line.split(",");

                FileStudent s=new FileStudent(
                        Integer.parseInt(arr[0]),arr[1],arr[2],arr[3]
                );
                temp.add(s);
            }

        }catch(Exception e) {
            System.out.println("CSV Read Error");
        }
        return temp;
	        
	    }

	
	//------------------------//Question 13// ------------------------//
	@Override
	public void writeObject() {
	        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filename))) {
	            oos.writeObject(list);
	            System.out.println("written to "+ filename);
	        } catch(Exception e) {
	            System.out.println("Object Write Error");
	        }
	    }
	
	
	//---------------------------//Question14//-----------------------//

	@Override
	public List<FileStudent> readFile() {
		List<FileStudent> temp=new ArrayList<>();

        try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filename))) {

            temp =(List<FileStudent>) ois.readObject();

        }catch(Exception e) {
            System.out.println("Object Read Error");
        }
        return temp;
		
	}



	
	
	
	
	
	
	}
	
	




