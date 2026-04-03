import java.util.*;

public class ForLoopTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value for sum");
		// take input from user
		int n = sc.nextInt();
		// initialize a int block
		int mul = 0;
		for (int i = 1; i <= 10; i++) {
			mul = i * n;
			// whatever the product is will be stored in mul block and again the loop will
			// resume until condition is met
			System.out.println(n + " * " + i + " = " + mul);
		}
	}
}