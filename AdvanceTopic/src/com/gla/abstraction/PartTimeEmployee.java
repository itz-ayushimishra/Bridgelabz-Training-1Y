package com.gla.abstraction;

public class PartTimeEmployee extends Employee {
    String dep;

    public PartTimeEmployee(String dep, String name, int id, double salary) {
        super(name, id, salary);
        this.dep = dep;
    }

    @Override
    public double salaryCalculation(int hours, int rate) {
        return hours * rate;
    }

    public void printInfo_PartTimeEmployee(){
        System.out.println("Department: " + dep);
    }
}
