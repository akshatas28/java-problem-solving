package Lecture_17;

import java.util.*;

// lect 17 = recursion
// print sum of n natural numbers
public class SumOfNatNum {
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
            System.out.print(sum);
            return;
        }
        sum += i; // its doing one step and then calling itself
        recursion(i + 1, n, sum); // self call = recursion
    }
}
