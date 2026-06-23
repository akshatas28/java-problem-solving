package Lecture_17;

import java.util.*;

// lect 17 = recursion
// print factorial of n numbers
public class Factorial {
    // declare another function apart from main
    public static void main(String[] args) {
        int n = 7;
        int fact = 1;
        recursion(n, fact);
    }

    public static void recursion(int n, int fact) {
        if (n == 0) { // base case
            System.out.println(fact);
            return;
        }
        fact *= n; // its doing one step and then calling itself
        recursion(n - 1, fact); // self call = recursion
    }
}
