package com.gla.abstraction;

public class Runner {
   public static void main(String[] args) {
       //upcasting
      Employee e1=new PartTimeEmployee("CS","Ayushi",13,0);
      e1.displayInfo();
       System.out.println("Paid to part time employee:");
       double paid=e1.salaryCalculation(2,1000);
       System.out.println(paid);
       System.out.println("--------------------------------");
       PartTimeEmployee e2=new PartTimeEmployee("CS","Ayushi",13,0);
       paid = e2.salaryCalculation(3, 2000);
       e2.displayInfo();
       System.out.println(paid);
    }
}
