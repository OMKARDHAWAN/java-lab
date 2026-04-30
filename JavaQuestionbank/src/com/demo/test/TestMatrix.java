package com.demo.test;

public class TestMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = matrix.length;
        
        
        System.out.println("Matrix before rotating:");
        for(int i = 0 ; i < n ; i++) {
        	for(int j = 0 ; j < n ; j++) {
           System.out.print(matrix[i][j] + " ");
        	}
        	System.out.println(" ");
        }
        
        System.out.println(" ");
        for(int i = 0 ; i < n ; i++) {
        	for(int j = i ; j < n ; j++) {
        		int temp = matrix[i][j];
        		matrix[i][j] = matrix[j][i];
        		matrix[j][i] = temp;
        	}
        }
        
        
//        reverse matrix;
        System.out.println("Matrix after rotating:");
        for(int i = 0 ; i < n ; i++) {
        	for(int j = 2 ; j >= 0 ; j--) {
        		System.out.print(matrix[i][j] + " ");
        	}
        	System.out.println(" ");
        }
        
        
        
        
        
    }
}