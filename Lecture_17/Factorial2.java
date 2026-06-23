package Lecture_17;

import java.util.*;
// lect 17 = recursion
// print factorial of n numbers

public class Factorial2 {
    // declare another function apart from main
    public static void main(String[] args) {
        int n = 7;
        System.out.println(recursion(n));
    }

    public static int recursion(int n) {
        if (n == 1 || n == 0) { // base case
            return 1;
        }
        int fact_nm1 = recursion(n - 1);
        int fact_n = n * fact_nm1; // its doing one step and then calling itself
        return fact_n; // self call = recursion
    }
}
