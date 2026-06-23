package Lecture_18;

import java.util.*;

// lect 18 = recursion 2
// print first and last element occurence of a string
public class FirstNLastOccurence {

	public static int first = -1;
	public static int last = -1;

	// declare another function apart from main
	public static void main(String[] args) {
		String st = "abaacdaefaah";
		char ele = 'a';
		int n = st.length() - 1;
		printStrEle(st, n, ele);
	}

	public static void printStrEle(String st, int n, char ele) {
		if (n == -1) {
			System.out.println("first time occurence " + first + " last time occurence " + last);
			return;
		}
		if (st.charAt(n) == 'a') {
			if (last == -1) {
				last = n;
			} else {
				first = n;
			}
		}
		printStrEle(st, n - 1, ele);
		// its doing one step and then calling itself
		// self call = recursion
	}
}
