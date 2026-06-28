package com.demo.dao;

import java.io.*;
import java.util.*;

import com.demo.model.Product;


public class ProductDaoImpl implements ProductDao {

    private final String INPUT="src/com/demo/text/input.txt";
    private final String OUTPUT="src/com/demo/text/productamount.dat";

    @Override
    public List<Product> readFile() {
        List<Product> list=new ArrayList<>();

        try (BufferedReader br=new BufferedReader(new FileReader(INPUT))) {
            String line;
            while((line=br.readLine())!=null) {
                String[] arr=line.split(":");
                int id=Integer.parseInt(arr[0]);
                String name=arr[1];
                int qty=Integer.parseInt(arr[2]);
                double price=Double.parseDouble(arr[3]);
                Product p = new Product(id, name, qty, price);
                list.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error reading file");
        }
        return list;
    }

    @Override
    public void writeFile(List<Product> list) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT))) {

            for (Product p : list) {
                bw.write(p.toString());
                bw.newLine();
            }

            System.out.println("Data written to productamount.dat");

        } catch (Exception e) {
            System.out.println("Error writing file");
        }
    }
}