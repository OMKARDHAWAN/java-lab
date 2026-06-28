package com.demo.test;
import java.lang.reflect.*;

import com.demo.model.SecretClass;




public class Test26 {
    public static void main(String[] args) {
        try {
            // 1. Create an instance of the class containing the private method
            SecretClass targetObject = new SecretClass();

            // 2. Get the Class object associated with SecretClass
            Class<?> clazz = targetObject.getClass();

            // 3. Retrieve the private method by providing its name and parameter types
            // "secretMethod" is the name, String.class is the parameter type it accepts
            Method method = clazz.getDeclaredMethod("secretMethod", String.class);

            // 4. Force Java to bypass access checks so we can call the private method
            method.setAccessible(true);

            // 5. Invoke the method on the target object, passing the required argument
            System.out.println("Attempting to invoke private method via Reflection...");
            method.invoke(targetObject, "Hello from Reflection!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}