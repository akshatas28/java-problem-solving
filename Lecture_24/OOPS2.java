package Lecture_24;

import java.util.*;

// lect 24 = oops
// 
class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.age);
        System.out.println(this.name);
    }

    // Student(){
    // System.out.println("constructor called");
    // }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class OOPS2 {
    // main function in primary class
    public static void main(String[] args) {
        // Student s1 = new Student(); //if given empty and no declaration in class,
        // java creates default, else declare and java will implement it
        Student s1 = new Student("aman", 24);
        s1.printInfo();
    }
}
