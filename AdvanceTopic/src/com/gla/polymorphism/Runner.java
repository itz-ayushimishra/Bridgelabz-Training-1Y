package com.gla.polymorphism;

public class Runner {
   public static void main(String args[]) {
       Calculator c1=new Calculator();
       int sum1=c1.add(11,21);
       System.out.println("Sum of integers: "+sum1);
       double sum2=c1.add(11.1,21.5);
       System.out.println("Sum of double: "+sum2);
    }
}
