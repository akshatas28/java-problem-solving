package Lecture_15;

//lecture 15 - BIT MANIPULATION : homework
//Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. [BONUS]
import java.util.*;

public class Assign3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number system : decimal = 10 or binary = 2, enter the number choice");
		int n = sc.nextInt();

		if (n == 10) {
			System.out.println("enter decimal number ");
			int decInput = sc.nextInt();
			String binaryNum = "";
			int remainder, quotient = decInput;
			for (int i = 1; i < 5; i++) {
				remainder = quotient % 2;
				binaryNum = Integer.toString(remainder) + binaryNum;
				quotient = quotient / 2;
			}
			System.out.println("Binary output of: " + decInput + "is : " + binaryNum);
		} else {
			System.out.println("enter size of binary bits ");
			int size = sc.nextInt();
			int arr[] = new int[size];
			int decNum = 0;
			for (int i = 0; i < size; i++) {

				arr[i] = sc.nextInt();
			}
			int start = 0;
			int end = arr.length - 1;

			while (start < end) {

				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;

				start++;
				end--;
			}
			for (int i = 0; i < size; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
			for (int j = size - 1; j >= 0; j--) {
				int mul = (int) Math.pow(2, j);
				int result = arr[j] * mul;
				decNum = result + decNum;
			}
			System.out.println("decimal number is: " + decNum);
			sc.close();
		}
	}
}
