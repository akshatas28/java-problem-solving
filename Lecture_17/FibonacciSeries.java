package Lecture_17;

import java.util.*;

// lect 17 = recursion
// print fibonacci series till nth term
public class FibonacciSeries {
    // declare another function apart from main
    public static void main(String[] args) {
        int st = 0;
        int ft = 1;
        int n = 7;
        System.out.println(st);
        System.out.println(ft);
        recursion(ft, st, n - 2);
    }

    public static void recursion(int ft, int st, int n) {
        if (n == 0) {
            return;
        }
        int nt = st + ft;
        System.out.println(nt);
        recursion(nt, ft, n - 1);
        // its doing one step and then calling itself
        // self call = recursion
    }
}
