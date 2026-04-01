import java.util.*;

//code for checking if else condition
//to check if a number is even or odd
public class IfElseEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // as int take max 3 numbers, for more than 3 use long, else for decimal
								// integers use float
		if (x % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
}