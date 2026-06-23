package Lecture_24;

import java.util.*;

abstract class Animal {
    abstract void walk();

    public void eat() {
        System.out.println("grains");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("4");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("2");
    }
}
// lect 24 = oops
// encapsulation = accessmodifiers

public class EncapsulationAccessModifiers3 {
    // main function in primary class
    public static void main(String[] args) {
        // provide input and it will display
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
        // if animal class initiated, it will show runtime error
    }
}
