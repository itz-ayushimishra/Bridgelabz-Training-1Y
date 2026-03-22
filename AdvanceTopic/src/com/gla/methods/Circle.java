package com.gla.methods;

public class Circle {
    public void areaOfCircle(int radius)
    {
        double area=Math.PI*radius*radius;
        System.out.println("Area of circle is: "+area);
    }
    public void circum(int radius)
    {
        double circum=2*Math.PI*radius;
        System.out.println("Circumference of circle is: "+circum);
    }
}
