package com.demo.test;

import java.util.*;
import com.demo.model.*;
import com.demo.service.*;

public class TestFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FileService service = new FileServiceImp();

        int ch;

        do {
            System.out.println("\n1 Add Student");
            System.out.println("2 Display Students");
            System.out.println("3 Save to CSV");
            System.out.println("4 Load from CSV");
            System.out.println("5 Save to Object File");
            System.out.println("6 Load from Object File");
            System.out.println("7 Exit");
            System.out.println("Enter Choice: ");

            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1->{
                	service.add();
                }
                
                case 2->{
                	service.displayAll();
                }

                case 3->{
                	service.saveCSV();
                }
                case 4->{
                	service.loadCSV();
                }

                case 5->{
                	service.saveObject();
                }

                case 6->{
                	service.loadObject();
                }

                case 7->{
                	System.out.println("Thank You visit Again!!!");
                	System.exit(0);
sc.close();
                }
            }

        } while (ch != 7);
    }
}