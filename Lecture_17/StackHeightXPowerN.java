package Lecture_17;

import java.util.*;

// lect 17 = recursion
// print x to the power n, stack height log n
public class StackHeightXPowerN {
	// declare another function apart from main
	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		System.out.println(calcPower(x, n));
	}

	public static int calcPower(int x, int n) {
		if (n == 0) {
			return 1;
		}
		if (x == 0) {
			return 0;
		}
		if (n % 2 == 0) {
			return calcPower(x, n / 2) * calcPower(x, n / 2);
		} else {
			return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
		}
		// its doing one step and then calling itself
		// self call = recursion
	}
}
