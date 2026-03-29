package com.gla.exception;

public class ExHandlingPractice {
        static void ageChecker(int age){
            if(age<18)
                throw new IllegalArgumentException("Invalid age");
            System.out.println("Valid age");
        }
        public static void main(String[] args) {
            try {
                ageChecker(10);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
}
