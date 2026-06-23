package Lecture_24;

import java.util.*;

// lect 24 = oops
// inheritance
class Shape {
    public void area() {
        System.out.println(area);
    }

    class Traingle extends Shape {
        public void area(int l, int h) {
            System.out.println(1 / 2 * l * h);
        }
    }

    class EquiTriangle extends Traingle {
        public void area(int r) {
            System.out.println(3.14 * r * r);
        }
    }

    // in this way, single level, multi level, heirarchial, hybrid
    public class Inheritance {
        // main function in primary class
        public static void main(String[] args) {
            // provide input and it will display

        }
    }
}
