package Lecture_18;

import java.util.*;

// lect 18 = recursion 2
// tower of hanoi
public class TowerOfHanoi {
    // declare another function apart from main
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer of disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("transfer of disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
        // its doing one step and then calling itself
        // self call = recursion
    }
}
