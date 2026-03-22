package com.gla.methods;

public class Rectangle {
    public void area(int length,int breadth)
    {
        int area=length*breadth;
        System.out.println("Area of rectangle is: "+area);

    }
    public void perimeter(int length,int breadth)
    {
        int peri=2*(length+breadth);
        System.out.println("Perimeter of rectangle is: "+peri);

    }
}
