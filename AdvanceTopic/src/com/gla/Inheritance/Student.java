package com.gla.Inheritance;

public class Student extends Teacher {
    int rollNo;
    String dep;
    String studentName;
    public Student(String studentName,int rollNo,String dep,String tName, String subject,int id,double salary) {
        super(tName,subject,id,salary);
        this.rollNo = rollNo;
        this.dep = dep;
        this.studentName = studentName;
    }
    public static void result(int score){
        if(score>=90)
            System.out.println("O");
        else if(score>=80&&score<90)
            System.out.println("A");
        else
            System.out.println("B");
    }
    public void studentInfo(){
        super.info();
        result(85);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Name: "+studentName);
        System.out.println("Department: "+dep);
    }
}
