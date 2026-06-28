package com.demo.test;

import com.demo.model.InvalidException;
import com.demo.model.Exception;
public class TestQue12 {
	 public static void checkItem(int age) throws InvalidException 
	    {
	        if (age < 18) 
	        {
	            throw new InvalidException("Error: The item is runs out....");
	        }
	        System.out.println(" Order confirmed: We have a stock");
	    }
	    public static void processWithdrawal(double balance, double amount) 
	    {
	        if (amount > balance) 
	        {
	            throw new Exception("Error: Withdrawal failed due to insufficient funds.");
	        }
	        System.out.println("Success! New balance: $" + (balance - amount));
	    }
	    public static void main(String[] args) 
	    {
	        System.out.println("Testing Checked Exception");
	        try {
	           checkItem (1);
	        } catch (InvalidException e) 
	        {
	            System.err.println(e.getMessage());
	        }
	        System.out.println("\nTesting Unchecked Exception");
	        try 
	        {
	                       processWithdrawal(500.00, 1200.00);
	        } catch (Exception e) 
	        {
	            System.err.println(e.getMessage());
	        }
	        
	        System.out.println("\nProgram execution continued successfully.");
	    }
}
