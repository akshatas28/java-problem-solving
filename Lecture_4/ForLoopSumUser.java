import java.util.*;

public class ForLoopSumUser {
	public static void main(String[] args) {
		// learning for loop
		// print sum for n numbers using for loop
		// input value from user
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter n value for sum");
		int n = sc.nextInt(); // this will be further used in "for" condition statement
		for (int i = 1; i <= n; i++) {
			sum = i + sum;
			// the n value will be vaildated in the condition
		}
		System.out.println("SUM of " + n + " numbers is " + sum);
	}
}