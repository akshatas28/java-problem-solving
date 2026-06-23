package Lecture_18;

import java.util.*;

// lect 18 = recursion one shot advanced
// print all subsets of a set of 1st n natural numbers
public class Subsets {
    // declare another function apart from main
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void subsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }
        subset.add(n);
        subsets(n - 1, subset);
        subset.remove(subset.size() - 1);
        subsets(n - 1, subset);
        // its doing one step and then calling itself
        // self call = recursion
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        subsets(n, subset);
    }
}
