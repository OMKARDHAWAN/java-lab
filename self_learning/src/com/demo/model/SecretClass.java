package com.demo.model;

//A class containing a private method that we want to invoke
public class SecretClass {
 private void secretMethod(String message) {
     System.out.println("Inside private method! Message received: " + message);
 }
}