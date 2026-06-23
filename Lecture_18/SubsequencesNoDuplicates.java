package Lecture_18;

import java.util.*;

// lect 18 = recursion 2
// print subsequences of a string but unique = no duplicates
public class SubsequencesNoDuplicates {
	// declare another function apart from main

	public static void subsequences(String st, int n, String newSt, HashSet<String> set) {
		if (n == st.length()) {
			if (set.contains(newSt)) {
				return;
			} else {
				System.out.println(newSt);
				set.add(newSt);
				return;
			}
		}
		char currChar = st.charAt(n);

		subsequences(st, n + 1, newSt + currChar, set);
		subsequences(st, n + 1, newSt, set);
		// its doing one step and then calling itself
		// self call = recursion
	}

	public static void main(String[] args) {
		String st = "aaa";
		String newSt = "";
		HashSet<String> set = new HashSet<>();
		subsequences(st, 0, newSt, set);
	}
}
