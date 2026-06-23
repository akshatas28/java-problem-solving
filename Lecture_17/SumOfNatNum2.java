package Lecture_17;

import java.util.*;

// lect 17 = recursion
// print sum of n natural numbers
public class SumOfNatNum2 {
    // declare another function apart from main
    public static void main(String[] args) {
        int n = 7;
        int i = 1;
        int sum = 0;
        recursion(i, n, sum);
    }

    public static void recursion(int i, int n, int sum) {
        if (i == n) { // base case
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i; // its doing one step and then calling itself
        recursion(i + 1, n, sum); // self call = recursion
        System.out.println(i);
        // here post calling recursion function, it executes the function then again
        // calls for successive functions untio condition is met. but a twist, when the
        // return is returning and deleting all thr memory, before deleting the loops it
        // traverses one last time until end to find if any other steps are there, if
        // yes, then those steps get executed per deletion step.
    }
}
