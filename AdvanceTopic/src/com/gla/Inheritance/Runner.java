package com.gla.Inheritance;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Parent");
        Animal a1 = new Animal();
        a1.walk();
        System.out.println("Child");
        Dog d1 = new Dog();
        d1.sound();
        d1.walk();
        System.out.println("Multi-level Inheritance");
        Puppy p1 = new Puppy();
        p1.walk();
        p1.sound();
        p1.looks();

        Student s1=new Student("Ayushi",13,"BTech","Tanmay","Java",101,85000);
        s1.studentInfo();
    }
}

