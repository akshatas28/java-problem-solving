package Lecture_24;

import java.util.*;

// lect 24 = oops
// Polymorphism 
class Student {
    String name;
    int age;

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }
}

public class Polymorphism {
    // main function in primary class
    public static void main(String[] args) {
        // Student s1 = new Student(); //if given empty and no declaration in class,
        // java creates default, else declare and java will implement it
        Student s1 = new Student();
        s1.name = "A";
        s1.age = 24;
        s1.printInfo(s1.age);
    }
}
