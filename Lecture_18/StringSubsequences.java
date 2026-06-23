package Lecture_18;

import java.util.*;
// lect 18 = recursion 2
// print subsequences of a string

public class StringSubsequences {
	// declare another function apart from main

	public static void subsequences(String st, int n, String newSt) {
		if (n == st.length()) {
			System.out.println(newSt);
			return;
		}
		char currChar = st.charAt(n);
		subsequences(st, n + 1, newSt + currChar);
		subsequences(st, n + 1, newSt);
		// its doing one step and then calling itself
		// self call = recursion
	}

	public static void main(String[] args) {
		String st = "abc";
		String newSt = "";
		subsequences(st, 0, newSt);
	}
}
