package Lecture_17;

import java.util.*;

// lect 17 = recursion
// print numbers from 5 to 1
public class Recursion {
	// declare another function apart from main
	public static void main(String[] args) {
		recursion(5);
	}

	public static void recursion(int n) {
		if (n == 0) { // base case
			return;
		}
		System.out.print(n); // its doing one step and then calling itself
		recursion(n - 1); // self call = recursion
	}
}
