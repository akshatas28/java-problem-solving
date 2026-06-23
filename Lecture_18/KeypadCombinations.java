package Lecture_18;

import java.util.*;

// lect 18 = recursion 2
// print keypad combination
public class KeypadCombinations {
	// declare another function apart from main
	public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

	public static void printComb(String st, int n, String newSt) {
		if (n == st.length()) {
			System.out.println(newSt);
			return;
		}
		char currChar = st.charAt(n);
		String mapping = keypad[currChar - '0'];
		for (int i = 0; i < mapping.length(); i++) {
			printComb(st, n + 1, newSt + mapping.charAt(i));
		}
		// its doing one step and then calling itself
		// self call = recursion
	}

	public static void main(String[] args) {
		String st = "23";
		String newSt = "";
		printComb(st, 0, newSt);
	}
}
