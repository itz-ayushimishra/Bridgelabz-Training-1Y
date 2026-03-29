package com.gla.exception;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}
class HandlingPractice {
    void ageChecker(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is invalid for voting");
        }
        System.out.println("Valid age for voting");
    }

    public static void main(String[] args) {
        HandlingPractice hp = new HandlingPractice();
        try {
            hp.ageChecker(18);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
