package com.gla.methods;

public class StaticNonStatic {
    public static void area(double radius){
        double areaOfCircle=Math.PI*radius*radius;
        System.out.println(areaOfCircle);
    }
    public void circum(double radius){
        double circumOfCircle = 2*Math.PI*radius;
        System.out.println(circumOfCircle);
    }
    public static void main(String[] args) {
        StaticNonStatic s1=new StaticNonStatic();
        s1.area(5);
        s1.circum(5);
        area(10);
    }



}
