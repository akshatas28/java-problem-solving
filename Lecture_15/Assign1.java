package Lecture_15;

import java.util.*;

//lecture 15 - BIT MANIPULATION : homework
//Write a program to find if a number is a power of 2 or not.
//Write a program to toggle a bit a position = “pos” in a number “n”.
//Write a program to count the number of 1’s in a binary representation of the number.
//Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. [BONUS]
public class Assign1 {
	public static void main(String[] args) {
		// declaration
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 2;
		for (int i = 1; i <= n; i++) {
			if (n == result) {
				System.out.println("n is pow of 2");
				break;
			} else if (result < n) {
				result = result * 2;
			} else {
				System.out.println("n is not pow of 2");
				break;
			}
		}
		sc.close();
	}
}
