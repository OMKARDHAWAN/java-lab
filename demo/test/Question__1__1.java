package com.demo.test;
class Question__1__1 {
    
    static boolean isPrime(int n) {
        if (n<=1)
            return false;

        for (int i=2;i<=Math.sqrt(n); i++) {
            if (n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String args[]) {

        
        if (args.length!=3) {
            System.out.println("Please enter exactly 3 numbers.");
            return;
        }
        for (int i=0;i<3;i++) {
            int num=Integer.parseInt(args[i]);

            System.out.println("\nNumber: " + num);
            if (isPrime(num)) {
                System.out.println("Prime Number :");
                for (int j=1;j<=10;j++) {
                    System.out.println(num +" x "+j+ " = "+(num * j));
                }

            } else {
                double result=num/10.0;
                System.out.println("Not Prime - Division Result: " + result);
            }
        }
    }
}