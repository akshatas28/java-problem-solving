import java.util.*;

//print factorial using function block
public class FactorialFunc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// call function, fuction can be directly called
		factorial(n);
		// function block will be returned
	}

	public static void factorial(int n) {
		// return mandatory
		if (n < 0) {
			System.out.println("invalid input"); // here u can mention new if block for 0 input and syso as 1
			return;
		}
		int num = 1;
		for (int i = 1; i <= n; i++) {
			num = num * i;
		}
		System.out.println(num);
		return;
	}
}

// Never prefer public static int function as u need to return which becomes
// very difficult to specify