package com.gla.Inheritance;

public class Teacher {
    String tName;
    String subject;
    int id;
    double salary;
 public Teacher(String tName, String subject, int id,double salary) {
     this.tName=tName;
     this.subject=subject;
     this.id=id;
     this.salary=salary;
 }
    public void info() {
        System.out.println("Name: " + tName);
        System.out.println("Subject: " + subject);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
