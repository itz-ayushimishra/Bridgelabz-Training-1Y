package com.gla.hybrid;


interface Worker {
    void performDuties();
}

class Person {
    String name;
}

class Chef extends Person implements Worker {
    public void performDuties() {
        System.out.println("Cooking");
    }
}

class Waiter extends Person implements Worker {
    public void performDuties() {
        System.out.println("Serving");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Chef c = new Chef();
        c.performDuties();
    }
}
