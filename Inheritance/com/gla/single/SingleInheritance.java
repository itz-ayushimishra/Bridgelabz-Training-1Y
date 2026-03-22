package com.gla.single;


class Book {
    String title;
    int year;
}

class Author extends Book {
    String name;
    String bio;

    void display() {
        System.out.println(title + " " + year + " " + name);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Author a = new Author();
        a.title = "Java";
        a.year = 2020;
        a.name = "ABC";
        a.display();
    }
}
