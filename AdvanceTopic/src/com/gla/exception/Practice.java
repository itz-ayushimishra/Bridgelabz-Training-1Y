package com.gla.exception;

public class Practice {
    static void ageChecker(int age){
        if(age<18)
            throw new ArithmeticException("Invalid age");
        System.out.println("Valid age");
    }
    public static void main(String[] args) {
        ageChecker(100);
        System.out.println();
    }
}
