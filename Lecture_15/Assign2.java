package Lecture_15;

import java.util.*;

//lecture 15 - BIT MANIPULATION : homework
//Write a program to find if a number is a power of 2 or not.
//Write a program to toggle a bit a position = “pos” in a number “n”.
//Write a program to count the number of 1’s in a binary representation of the number.
//Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. [BONUS]
public class Assign2 {
	public static void main(String[] args) {
		// declaration
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		System.out.println("enter position to be shift");
		int pos = sc.nextInt();
		System.out.println("enter int for which shift is needed: left = 1 or right = 0");
		int shift = sc.nextInt();
		// if shift was taken as string then if condition could be checked by :
		// shift.equal('left')
		if (shift == 1) {
			int leftShiftAns = n << pos;
			System.out.println("left shift: " + leftShiftAns);
			// 32 bit storage for java so the buts can be shifted until until 31st position
			// ie 32nd bit
		} else if (shift == 0) {
			int rightShiftAns = n >> pos;
			System.out.println("right shift: " + rightShiftAns);
		} else {
			System.out.println("invalid shift input");
		}
		sc.close();
	}
}
