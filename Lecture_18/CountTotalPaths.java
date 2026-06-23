package Lecture_18;

import java.util.*;

// lect 18 = recursion one shot advanced
// print count of total paths to move from 0,0 to n,m
public class CountTotalPaths {
    // declare another function apart from main
    public static int countPaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int downPaths = countPaths(i + 1, j, n, m);
        int rightPaths = countPaths(i, j + 1, n, m);
        return downPaths + rightPaths;
        // its doing one step and then calling itself
        // self call = recursion
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println(totalPaths);
    }
}
